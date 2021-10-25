package com.xiaoyv.dingtools.plugin.manager

import com.xiaoyv.dingtools.plugin.config.*

/**
 * DingConfigManager
 *
 * @author why
 * @since 2021/10/25
 **/
class DingConfigManager {

    private val configs = linkedMapOf<String, DingBaseConfig>()

    init {
        configs["6.3.0"] = DingConfig630.create()
        configs["6.3.5"] = DingConfig635.create()
        configs["6.3.6"] = DingConfig636.create()
        configs["6.3.7"] = DingConfig637.create()
    }

    /**
     * 判断 hookApp 的当前版本是否适配
     */
    fun hasAdapt(versionName: String) = configs.keys.contains(versionName)

    /**
     * 判断 hookApp 的当前版本是否适配
     */
    fun getConfig(versionName: String): DingBaseConfig? = configs[versionName]

    companion object {

        @JvmStatic
        val INSTANCE: DingConfigManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            DingConfigManager()
        }
    }
}