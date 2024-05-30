package com.killergram.killergrambackend.domain.user.domain

import com.killergram.killergrambackend.domain.user.domain.type.Ability
import com.killergram.killergrambackend.domain.user.domain.type.Gender
import com.killergram.killergrambackend.global.entity.BaseUUIDEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType.STRING
import jakarta.persistence.Enumerated
import jakarta.persistence.FetchType.LAZY
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToOne

@Entity(name = "tbl_student")
class Student(
    @Column(columnDefinition = "VARCHAR(30)", nullable = false)
    val name: String,

    @Column(columnDefinition = "CHAR(4)", nullable = false, unique = true)
    val schoolNumber: String,

    @Column(columnDefinition = "VARCHAR(5)", nullable = false)
    @Enumerated(value = STRING)
    val gender: Gender,

    @Column(columnDefinition = "VARCHAR(5)", nullable = false)
    @Enumerated(value = STRING)
    val ability: Ability,

    user: User
) : BaseUUIDEntity() {
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "user_id", columnDefinition = "BINARY(16)", nullable = false)
    var user = user
        protected set
}