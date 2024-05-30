package com.killergram.killergrambackend.domain.user.service

import com.killergram.killergrambackend.domain.user.controller.dto.request.StudentSignUpRequest
import com.killergram.killergrambackend.domain.user.domain.Student
import com.killergram.killergrambackend.domain.user.domain.User
import com.killergram.killergrambackend.domain.user.domain.type.Authority
import com.killergram.killergrambackend.domain.user.facade.UserFacade
import com.killergram.killergrambackend.domain.user.repository.StudentJpaRepository
import com.killergram.killergrambackend.domain.user.repository.UserJpaRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class StudentSignUpService(
    private val userJpaRepository: UserJpaRepository,
    private val studentJpaRepository: StudentJpaRepository,
    private val userFacade: UserFacade,
    private val passwordEncoder: PasswordEncoder,
) {
    @Transactional
    fun execute(request: StudentSignUpRequest) {
        userFacade.checkStudentExists(request.accountId, request.schoolNumber)

        request.run {
            val user = userJpaRepository.save(
                User(
                    accountId = accountId,
                    password = passwordEncoder.encode(password),
                    deviceToken = deviceToken,
                    authority = Authority.STUDENT
                )
            )
            studentJpaRepository.save(
                Student(
                    name = name,
                    schoolNumber = schoolNumber,
                    gender = gender,
                    ability = ability,
                    user = user
                )
            )
        }
    }
}