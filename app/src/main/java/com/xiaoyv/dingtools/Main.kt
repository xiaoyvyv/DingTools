package com.xiaoyv.dingtools

import android.app.Application
import android.util.Log
import com.blankj.utilcode.util.LogUtils
import com.blankj.utilcode.util.Utils
import com.sky.xposed.javax.MethodHook
import com.sky.xposed.javax.XposedPlus
import com.sky.xposed.javax.XposedUtil
import com.xiaoyv.dingtools.plugin.constact.DingConstant
import com.xiaoyv.dingtools.plugin.manager.DingServiceManager
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.callbacks.XC_LoadPackage


/**
 * Main
 *
 * @author why
 * @since 2021/10/25
 */
class Main : IXposedHookLoadPackage, MethodHook.ThrowableCallback {
    /**
     * 全局 Hook 入口
     */
    override fun handleLoadPackage(lpParam: XC_LoadPackage.LoadPackageParam) {
        if (lpParam.packageName != DingConstant.DING_PKG_NAME) {
            return
        }
        Log.e(TAG, "钉钉 Hook start kt!")

        // 扩展
        val xposedPlus = XposedPlus.Builder(lpParam)
            .throwableCallback(this)
            .build()

        // 设置默认的参数
        XposedPlus.setDefaultInstance(xposedPlus)

        // DexApplication 初始化，匹配主 Application
        XposedUtil.findMethod(DingConstant.DING_DEX_APPLICATION_NAME, "onCreate")
            .before {
                val application = it.thisObject as? Application ?: return@before
                val applicationName = application.javaClass.name

                // 匹配 LauncherApplication
                if (DingConstant.DING_LAUNCHER_APPLICATION_NAME == applicationName) {
                    initPlugin(application)
                    LogUtils.i("钉钉 Hook start!")

                    val hookContext = application.applicationContext

                    // 初始化并开始处理加载的包
                    DingServiceManager.INSTANCE.init(hookContext, lpParam)
                    DingServiceManager.INSTANCE.handleLoadPackage()
                }
            }
    }

    override fun onThrowable(tr: Throwable?) {

    }

    companion object {
        const val TAG = "DingTools"

        /**
         * Plugin application hook init
         */
        @JvmStatic
        fun initPlugin(application: Application) {

            // 初始化 Utils
            Utils.init(application)

            initLog()
        }

        /**
         * Log init
         */
        @JvmStatic
        private fun initLog() {
            LogUtils.getConfig().apply {
                globalTag = TAG
                isLogSwitch = true
            }
        }
    }
}