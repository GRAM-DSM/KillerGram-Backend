package com.killergram.killergrambackend.domain.user.controller

import com.killergram.killergrambackend.domain.user.controller.dto.request.StudentSignUpRequest
import com.killergram.killergrambackend.domain.user.service.StudentSignUpService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/users")
@RestController
class UserController(
    private val studentSignUpService: StudentSignUpService,
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/student")
    fun studentSignUp(@RequestBody @Valid request: StudentSignUpRequest) {
        studentSignUpService.execute(request)
    }
}