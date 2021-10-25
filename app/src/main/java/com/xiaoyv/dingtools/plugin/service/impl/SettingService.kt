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

    }

    companion object {

        @JvmStatic
        fun create() = SettingService()
    }
}