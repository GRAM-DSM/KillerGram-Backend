package com.killergram.killergrambackend.global.error.exception

enum class ErrorCode(
    val statusCode: Int,
    val message: String
) {
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");
}