package com.xiaoyv.dingtools.plugin.config

import java.io.Serializable

/**
 * DingBaseConfig
 *
 * @author why
 * @since 2021/10/25
 **/
open class DingBaseConfig : Serializable {
    private val config = hashMapOf<Int, String>()

    /**
     * 添加
     */
    open fun add(key: Int, value: String) {
        config[key] = value
    }

    /**
     * 获取
     */
    open fun get(key: Int): String? {
        if (config.containsKey(key)) {
            return config[key].orEmpty()
        }
        return null
    }
}