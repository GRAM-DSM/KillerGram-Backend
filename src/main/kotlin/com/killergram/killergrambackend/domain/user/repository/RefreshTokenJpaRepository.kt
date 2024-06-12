package com.killergram.killergrambackend.domain.user.repository

import com.example.sharing.domain.user.domain.RefreshToken
import com.killergram.killergrambackend.domain.user.domain.User
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface RefreshTokenJpaRepository : CrudRepository<RefreshToken, String> {
    fun findByToken(refreshToken: String): RefreshToken
}