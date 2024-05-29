package com.killergram.killergrambackend.global.error.exception

import java.lang.RuntimeException

abstract class KillergramException(
    val errorCode: ErrorCode
): RuntimeException() {
    val statusCode: Int
        get() = errorCode.statusCode

    override val message: String
        get() = errorCode.message
}