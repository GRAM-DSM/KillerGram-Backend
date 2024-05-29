package com.killergram.killergrambackend.domain.user.repository

import com.killergram.killergrambackend.domain.user.domain.Student
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface StudentJpaRepository : CrudRepository<Student, UUID> {

    fun findBySchoolNumber(schoolNumber: String): Student?
}