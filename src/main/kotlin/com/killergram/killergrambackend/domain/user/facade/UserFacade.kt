package com.killergram.killergrambackend.domain.user.facade

import com.killergram.killergrambackend.domain.user.domain.User
import com.killergram.killergrambackend.domain.user.exception.UserAlreadyExistsException
import com.killergram.killergrambackend.domain.user.exception.UserNotFoundException
import com.killergram.killergrambackend.domain.user.repository.StudentJpaRepository
import com.killergram.killergrambackend.domain.user.repository.UserJpaRepository
import org.springframework.stereotype.Component

@Component
class UserFacade(
    private val userJpaRepository: UserJpaRepository,
    private val studentJpaRepository: StudentJpaRepository,
) {

    fun checkStudentExists(accountId: String, schoolNumber: String) {
        if (userJpaRepository.findByAccountId(accountId) != null) {
            throw UserAlreadyExistsException
        }
        if (studentJpaRepository.findBySchoolNumber(schoolNumber) != null) {
            throw UserAlreadyExistsException
        }
    }

    fun getByUser(accountId: String): User {
        return userJpaRepository.findByAccountId(accountId) ?: throw UserNotFoundException
    }
}