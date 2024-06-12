package com.killergram.killergrambackend.domain.user.controller.dto.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

data class UserLoginRequest(
    @field:NotBlank
    @Size(max = 30)
    val accountId: String,

    @field:Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[\$@\$!%*#?&])[A-Za-z\\d\$@\$!%*#?&]{8,16}\$")
    val password: String,
)