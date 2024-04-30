package com.killergram.killergrambackend.domain.application.domain

import com.killergram.killergrambackend.domain.user.domain.Student
import com.killergram.killergrambackend.global.entity.BaseUUIDEntity
import jakarta.persistence.Entity
import jakarta.persistence.FetchType.LAZY
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "tbl_application")
class Application(
    student: Student,
    sportApplication: SportApplication
) : BaseUUIDEntity() {
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "student_id", columnDefinition = "BINARY(16)", nullable = false)
    var student = student
        protected set

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "sport_application_id", columnDefinition = "BINARY(16)", nullable = false)
    var sportApplication = sportApplication
        protected set
}