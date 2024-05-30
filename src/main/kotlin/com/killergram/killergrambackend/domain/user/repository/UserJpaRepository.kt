package com.killergram.killergrambackend.domain.user.repository

import com.killergram.killergrambackend.domain.user.domain.User
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface UserJpaRepository : CrudRepository<User, UUID> {

    fun findByAccountId(accountId: String): User?
}