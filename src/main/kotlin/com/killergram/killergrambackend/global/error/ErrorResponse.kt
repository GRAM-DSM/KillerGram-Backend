package com.killergram.killergrambackend.global.error

import com.killergram.killergrambackend.global.error.exception.KillergramException

class ErrorResponse(
    val statusCode: Int,
    val message: String,
) {
    companion object {
        fun of(e: KillergramException): ErrorResponse {
            return ErrorResponse(
                statusCode = e.statusCode,
                message = e.message
            )
        }
    }
}