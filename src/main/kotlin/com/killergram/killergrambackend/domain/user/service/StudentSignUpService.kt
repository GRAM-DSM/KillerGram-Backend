package com.killergram.killergrambackend.domain.user.service

import com.killergram.killergrambackend.domain.user.controller.dto.request.StudentSignUpRequest
import com.killergram.killergrambackend.domain.user.domain.Student
import com.killergram.killergrambackend.domain.user.domain.User
import com.killergram.killergrambackend.domain.user.domain.type.Authority
import com.killergram.killergrambackend.domain.user.exception.UserAlreadyExistsException
import com.killergram.killergrambackend.domain.user.repository.StudentJpaRepository
import com.killergram.killergrambackend.domain.user.repository.UserJpaRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class StudentSignUpService(
    private val userJpaRepository: UserJpaRepository,
    private val studentJpaRepository: StudentJpaRepository,
    private val passwordEncoder: PasswordEncoder,
) {
    @Transactional
    fun execute(request: StudentSignUpRequest) {
        if (userJpaRepository.findByAccountId(request.accountId) != null) {
            throw UserAlreadyExistsException
        }
        if (studentJpaRepository.findBySchoolNumber(request.schoolNumber) != null) {
            throw UserAlreadyExistsException
        }

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