@file:Suppress("unused", "SpellCheckingInspection", "ClassName")

package com.xiaoyv.dingtools.plugin.config

/**
 * D
 *
 * @author why
 * @since 2021/10/25
 **/
class D {

    /**
     * hook 相关类
     */
    object classz {
        const val class_rimet_LauncherApplication = 0x1f000001
        const val class_dingtalkbase_multidexsupport_DDApplication = 0x1f000002
        const val class_defpackage_MessageDs = 0x1f000003
        const val class_plugin_webwx_ui_ExtDeviceWXLoginUI = 0x1f000004
        const val class_defpackage_ServiceFactory = 0x1f000005
        const val class_android_dingtalk_redpackets_idl_service_RedEnvelopPickIService = 0x1f000006
        const val class_defpackage_RedPacketsRpc = 0x1f000007
        const val class_defpackage_RedPacketsRpc_9 = 0x1f000008
        const val class_lightapp_runtime_LightAppRuntimeReverseInterfaceImpl = 0x1f000009
        const val class_android_dingtalk_redpackets_activities_FestivalRedPacketsPickActivity =
            0x1f00000A
        const val class_android_dingtalk_redpackets_activities_PickRedPacketsActivity = 0x1f00000B
        const val class_android_user_settings_activity_NewSettingActivity = 0x1f00000C
        const val class_wukong_im_base_IMDatabase = 0x1f00000D
    }

    /**
     * hook 相关方法
     */
    object method {
        const val method_dingtalkbase_multidexsupport_DDApplication_onCreate = 0x2f000001
        const val method_defpackage_MessageDs_handler = 0x2f000002
        const val method_android_dingtalkim_base_model_typeValue = 0x2f000003
        const val method_wukong_im_message_MessageImpl_messageContent = 0x2f000004
        const val method_wukong_im_message_MessageContentImpl_contents = 0x2f000005
        const val method_defpackage_RedPacketsRpc_newInstance = 0x2f000006
        const val method_defpackage_ServiceFactory_getService = 0x2f000007
        const val method_android_dingtalk_redpackets_idl_service_RedEnvelopPickIService_pickRedEnvelopCluster =
            0x2f000008
        const val method_lightapp_runtime_LightAppRuntimeReverseInterfaceImpl_initSecurityGuard =
            0x2f000009
        const val method_android_dingtalk_redpackets_activities_FestivalRedPacketsPickActivity_initView =
            0x2f00000A
        const val method_android_dingtalk_redpackets_activities_PickRedPacketsActivity_initView =
            0x2f00000B
        const val method_android_user_settings_activity_NewSettingActivity_onCreate = 0x2f00000C
        const val method_defpackage_MessageDs_recall = 0x2f00000D
        const val method_wukong_im_conversation_ConversationImpl_latestMessage = 0x2f00000E
        const val method_wukong_im_base_IMDatabase_getWritableDatabase = 0x2f00000F
        const val method_defpackage_MessageDs_update = 0x2f000010
        const val method_wukong_im_message_MessageContentImpl_TextContentImpl_text = 0x2f000011
        const val method_wukong_im_message_MessageContentImpl_TextContentImpl_setText = 0x2f000012
    }

    /**
     * hook 相关字段
     */
    object field {
        const val field_android_dingtalkim_base_model_DingtalkMessage_msgDisplayType = 0x3f000001
        const val field_wukong_im_message_MessageContentImpl_CustomMessageContentImpl_mExtension =
            0x3f000002
        const val field_android_dingtalkim_base_model_DingtalkMessage_mConversation = 0x3f000003
    }

    /**
     * key
     */
    object key {
        const val key_sid = 0x4f000001
        const val key_clusterid = 0x4f000002
    }

    /**
     * res
     */
    object res {
        const val res_iv_pick = 0x5f000001
        const val res_btn_pick = 0x5f000002
        const val res_setting_msg_notice = 0x5f000003
    }
}