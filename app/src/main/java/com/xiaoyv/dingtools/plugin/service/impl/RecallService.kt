package com.xiaoyv.dingtools.plugin.service.impl

import android.content.ContentValues
import android.content.Context
import com.blankj.utilcode.util.LogUtils
import com.sky.xposed.javax.XposedUtil
import com.xiaoyv.dingtools.plugin.config.D
import com.xiaoyv.dingtools.plugin.service.IRecallService

/**
 * RecallService
 *
 * @author why
 * @since 2021/10/25
 **/
class RecallService : IRecallService {
    private val enableRecall = true

    override fun onCreate(hkContext: Context) {
        XposedUtil.findMethod(
            getConfigValue(D.classz.class_defpackage_MessageDs),
            getConfigValue(D.method.method_defpackage_MessageDs_recall),
            String::class.java, List::class.java, ContentValues::class.java
        ).before {

            LogUtils.i("处理撤回消息: " + it.args[0] + " " + it.args[1] + " " + it.args[2])

            // 处理撤回消息
            if (onRecallMessage(it.args[2] as? ContentValues)) {
                // 直接返回0
                it.result = 0
            }
        }
    }

    override fun onRecallMessage(contentValues: ContentValues?): Boolean {
        if (!enableRecall || contentValues == null) {
            return false
        }
        val integer = contentValues.getAsInteger("recall")
        return integer != null && integer == 1
    }

    companion object {

        @JvmStatic
        fun create() = RecallService()
    }

}