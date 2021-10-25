package com.xiaoyv.dingtools.plugin.manager

import android.content.Context
import com.blankj.utilcode.util.AppUtils
import com.blankj.utilcode.util.LogUtils
import com.xiaoyv.dingtools.plugin.constact.DingConstant
import com.xiaoyv.dingtools.plugin.exception.DingException
import com.xiaoyv.dingtools.plugin.service.IService
import com.xiaoyv.dingtools.plugin.service.impl.RecallService
import com.xiaoyv.dingtools.plugin.service.impl.SettingService
import de.robv.android.xposed.callbacks.XC_LoadPackage

/**
 * DingServiceManager
 *
 * @author why
 * @since 2021/10/25
 **/
class DingServiceManager {
    /**
     * 目标 App 进程上下文
     */
    private var hookContext: Context? = null

    /**
     * 目标 App 相关信息
     */
    private var hookLpParam: XC_LoadPackage.LoadPackageParam? = null

    /**
     * 全部的 Hook 处理相关服务类
     */
    private val pluginServices = hashMapOf<String, IService>()

    /**
     * 初始化
     */
    fun init(hookContext: Context, lpParam: XC_LoadPackage.LoadPackageParam) {
        this.hookContext = hookContext
        this.hookLpParam = lpParam
    }

    /**
     * 获取非空 HookContext
     */
    fun getHookContext() =
        INSTANCE.hookContext ?: throw DingException.of("Please init DingManager!!!")

    /**
     * 获取非空 HookParam
     */
    fun getHookParam() =
        INSTANCE.hookLpParam ?: throw DingException.of("Please init DingManager!!!")

    /**
     * 加载 Hook 相关代码
     */
    fun handleLoadPackage() {
        pluginServices.clear()

        // 加载的 hook 服务
        pluginServices[DingConstant.PLUGIN_SERVICE_SETTING] = SettingService.create()
        pluginServices[DingConstant.PLUGIN_SERVICE_RECALL] = RecallService.create()

        start()
    }

    /**
     * hook 开始
     */
    private fun start() {
        pluginServices.forEach { entry ->
            runCatching {
                val service = entry.value
                // 如果可用，则执行
                if (service.enable()) {
                    LogUtils.i("${entry.key} start...")
                    service.onCreate(getHookContext())
                }
            }.onSuccess {
                LogUtils.i("${entry.key} start success!!!")
            }.onFailure {
                LogUtils.e("${entry.key} start failure!!!", it)
            }
        }
    }

    /**
     * 获取 Hook App 的版本名
     */
    fun getHookAppVersionName(): String {
        return AppUtils.getAppVersionName(getHookParam().packageName)
    }

    /**
     * 获取 Hook App 的版本号
     */
    fun getHookAppVersionCode(): Int {
        return AppUtils.getAppVersionCode(getHookParam().packageName)
    }

    companion object {

        @JvmStatic
        val INSTANCE: DingServiceManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            DingServiceManager()
        }


    }
}