package com.xiaoyv.dingtools.plugin.service

import android.content.ContentValues

/**
 * IRecallService
 *
 * @author why
 * @since 2021/10/26
 **/
interface IRecallService : IService {

    /**
     * 判断是是撤回消息
     */
    fun onRecallMessage(contentValues: ContentValues?): Boolean
}