package com.xiaoyv.dingtools.plugin.config


/**
 * DingConfig635
 *
 * @author why
 * @since 2021/10/25
 **/
class DingConfig630 : DingBaseConfig() {

    init {
        /**
         * Class
         */
        add(
            D.classz.class_rimet_LauncherApplication,
            "com.alibaba.android.rimet.LauncherApplication"
        )
        add(
            D.classz.class_dingtalkbase_multidexsupport_DDApplication,
            "com.alibaba.android.dingtalkbase.multidexsupport.DDApplication"
        )
        // MessageDs
        add(
            D.classz.class_defpackage_MessageDs,
            "qlk,qlk"
        )
        add(
            D.classz.class_plugin_webwx_ui_ExtDeviceWXLoginUI,
            "com.tencent.mD.plugin.webwx.ui.ExtDeviceWXLoginUI"
        )
        // ServiceFactory
        add(
            D.classz.class_defpackage_ServiceFactory,
            "sdi,sdi"
        )
        add(
            D.classz.class_android_dingtalk_redpackets_idl_service_RedEnvelopPickIService,
            "com.alibaba.android.dingtalk.redpackets.idl.service.RedEnvelopPickIService"
        )
        // RedPacketsRpc
        add(
            D.classz.class_defpackage_RedPacketsRpc,
            "eci"
        )
        // RedPacketsRpc$xx
        add(
            D.classz.class_defpackage_RedPacketsRpc_9,
            "eci$7"
        )
        add(
            D.classz.class_lightapp_runtime_LightAppRuntimeReverseInterfaceImpl,
            "com.alibaba.lightapp.runtime.LightAppRuntimeReverseInterfaceImpl"
        )
        add(
            D.classz.class_android_dingtalk_redpackets_activities_FestivalRedPacketsPickActivity,
            "com.alibaba.android.dingtalk.redpackets.activities.FestivalRedPacketsPickActivity"
        )
        add(
            D.classz.class_android_dingtalk_redpackets_activities_PickRedPacketsActivity,
            "com.alibaba.android.dingtalk.redpackets.activities.PickRedPacketsActivity"
        )
        add(
            D.classz.class_android_user_settings_activity_NewSettingActivity,
            "com.alibaba.android.user.settings.activity.NewSettingActivity"
        )
        add(
            D.classz.class_wukong_im_base_IMDatabase,
            "com.alibaba.wukong.iD.base.IMDatabase"
        )

        /**
         * Method
         */
        add(
            D.method.method_dingtalkbase_multidexsupport_DDApplication_onCreate,
            "onCreate"
        )
        // INSERT,IGNORE,INSERT_FAIL
        add(
            D.method.method_defpackage_MessageDs_handler,
            "a,a"
        )
        add(
            D.method.method_android_dingtalkim_base_model_typeValue,
            "typeValue"
        )
        add(
            D.method.method_wukong_im_message_MessageImpl_messageContent,
            "messageContent"
        )
        add(
            D.method.method_wukong_im_message_MessageContentImpl_contents,
            "contents"
        )
        add(
            D.method.method_defpackage_RedPacketsRpc_newInstance,
            "a"
        )
        add(
            D.method.method_defpackage_ServiceFactory_getService,
            "a,a"
        )
        add(
            D.method.method_android_dingtalk_redpackets_idl_service_RedEnvelopPickIService_pickRedEnvelopCluster,
            "pickRedEnvelopCluster"
        )
        add(
            D.method.method_lightapp_runtime_LightAppRuntimeReverseInterfaceImpl_initSecurityGuard,
            "initSecurityGuard"
        )
        add(
            D.method.method_android_dingtalk_redpackets_activities_FestivalRedPacketsPickActivity_initView,
            "a"
        )
        add(
            D.method.method_android_dingtalk_redpackets_activities_PickRedPacketsActivity_initView,
            "a"
        )
        add(
            D.method.method_android_user_settings_activity_NewSettingActivity_onCreate,
            "onCreate"
        )
        add(
            D.method.method_defpackage_MessageDs_recall,
            "a,a"
        )
        add(
            D.method.method_wukong_im_conversation_ConversationImpl_latestMessage,
            "latestMessage"
        )
        add(
            D.method.method_wukong_im_base_IMDatabase_getWritableDatabase,
            "getWritableDatabase"
        )
        add(
            D.method.method_defpackage_MessageDs_update,
            "a,a"
        )
        add(
            D.method.method_wukong_im_message_MessageContentImpl_TextContentImpl_text,
            "text"
        )
        add(
            D.method.method_wukong_im_message_MessageContentImpl_TextContentImpl_setText,
            "setText"
        )

        /**
         * Field
         */
        add(
            D.field.field_android_dingtalkim_base_model_DingtalkMessage_msgDisplayType,
            "msgDisplayType"
        )
        add(
            D.field.field_wukong_im_message_MessageContentImpl_CustomMessageContentImpl_mExtension,
            "mExtension"
        )
        add(
            D.field.field_android_dingtalkim_base_model_DingtalkMessage_mConversation,
            "mConversation"
        )

        /**
         * Key
         */
        add(
            D.key.key_sid,
            "sid"
        )
        add(
            D.key.key_clusterid,
            "clusterid"
        )

        /**
         * Res
         */
        add(
            D.res.res_iv_pick,
            "iv_pick"
        )
        add(
            D.res.res_btn_pick,
            "btn_pick"
        )
        add(
            D.res.res_setting_msg_notice,
            "setting_msg_notice"
        )
    }

    companion object {
        @JvmStatic
        fun create() = DingConfig630()
    }
}