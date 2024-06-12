package com.killergram.killergrambackend.domain.user.service

import com.killergram.killergrambackend.domain.user.controller.dto.request.UserLoginRequest
import com.killergram.killergrambackend.domain.user.controller.dto.response.TokenResponse
import com.killergram.killergrambackend.domain.user.facade.UserFacade
import com.killergram.killergrambackend.global.security.jwt.JwtTokenProvider
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserLoginService(
    private val userFacade: UserFacade,
    private val jwtTokenProvider: JwtTokenProvider
) {
    @Transactional
    fun execute(request: UserLoginRequest): TokenResponse {
        return request.run {
            val user = userFacade.getByUser(accountId)
            jwtTokenProvider.generateToken(user.accountId)
        }
    }
}