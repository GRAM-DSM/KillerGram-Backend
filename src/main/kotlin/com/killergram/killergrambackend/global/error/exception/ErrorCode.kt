package com.killergram.killergrambackend.global.error.exception

enum class ErrorCode(
    val statusCode: Int,
    val message: String
) {

    USER_NOT_FOUND(404, "User Not Found"),

    USER_ALREADY_EXISTS(409, "User Already Exists"),

    INTERNAL_SERVER_ERROR(500, "Internal Server Error");
}