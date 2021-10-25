package com.xiaoyv.dingtools.plugin.exception

/**
 * DingException
 *
 * @author why
 * @since 2021/10/25
 **/
class DingException : Exception {
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)

    companion object {
        @JvmStatic
        fun of(message: String) = DingException(message)

        @JvmStatic
        fun of(message: String, cause: Throwable) = DingException(message, cause)
    }
}