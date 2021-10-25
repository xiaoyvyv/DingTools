package com.xiaoyv.dingtools.plugin.service.impl

import android.content.Context
import com.sky.xposed.javax.MethodHook
import com.sky.xposed.javax.XposedUtil
import com.xiaoyv.dingtools.plugin.service.IService
import de.robv.android.xposed.XC_MethodHook

/**
 * SettingService
 *
 * @author why
 * @since 2021/10/25
 **/
class SettingService : IService {

    override fun onCreate(hkContext: Context) {
        XposedUtil.findMethod("","",)
            .hook(object :MethodHook.HookCallback{
                override fun onBefore(param: XC_MethodHook.MethodHookParam?) {
                    TODO("Not yet implemented")
                }

                override fun onAfter(param: XC_MethodHook.MethodHookParam?) {
                    TODO("Not yet implemented")
                }

            })
    }

    companion object {

        @JvmStatic
        fun create() = SettingService()
    }
}