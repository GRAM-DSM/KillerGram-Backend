package com.killergram.killergrambackend.domain.user.controller.dto.response

data class TokenResponse(
    val accessToken: String,
    val refreshToken: String
)
