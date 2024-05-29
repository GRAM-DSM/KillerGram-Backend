package com.killergram.killergrambackend.domain.user.controller.dto.request

import com.killergram.killergrambackend.domain.user.domain.type.Ability
import com.killergram.killergrambackend.domain.user.domain.type.Gender
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

data class StudentSignUpRequest(

    @field:NotBlank
    @Size(max = 30)
    val accountId: String,

    @field:Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[\$@\$!%*#?&])[A-Za-z\\d\$@\$!%*#?&]{8,16}\$")
    val password: String,

    @field:NotBlank
    val deviceToken: String,

    @field:NotBlank
    val name: String,

    @field:NotBlank
    val schoolNumber: String,

    @field:NotNull
    val gender: Gender,

    @field:NotNull
    val ability: Ability,
)