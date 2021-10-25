package com.xiaoyv.dingtools.plugin.service

import android.content.Context
import com.xiaoyv.dingtools.plugin.config.DingBaseConfig
import com.xiaoyv.dingtools.plugin.exception.DingException
import com.xiaoyv.dingtools.plugin.manager.DingConfigManager
import com.xiaoyv.dingtools.plugin.manager.DingServiceManager

/**
 * IHandle
 *
 * @author why
 * @since 2021/10/25
 **/
interface IService {

    /**
     * hook 服务开始
     *
     * @param hkContext hook 对象上下文
     */
    fun onCreate(hkContext: Context)

    /**
     * 获取 Hook app 版本号
     */
    fun getHookAppVersionName() = DingServiceManager.INSTANCE.getHookAppVersionName()

    /**
     * 获取当前版本 hook 相关类的配置
     */
    fun getConfig(): DingBaseConfig {
        return DingConfigManager.INSTANCE.getConfig(getHookAppVersionName())
            ?: throw DingException.of("当前版本未适配")
    }

    /**
     * 获取 hook 的类路径
     */
    fun getConfigValue(key: Int): String {
        return getConfig().get(key) ?: throw DingException.of("hook 配置不存在：key = $key")
    }

    /**
     * 是否可用
     */
    fun enable(): Boolean {
        return DingConfigManager.INSTANCE.hasAdapt(getHookAppVersionName())
    }
}