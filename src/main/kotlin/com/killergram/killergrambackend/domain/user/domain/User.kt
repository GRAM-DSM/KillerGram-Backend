package com.killergram.killergrambackend.domain.user.domain

import com.killergram.killergrambackend.domain.user.domain.type.Authority
import com.killergram.killergrambackend.global.entity.BaseUUIDEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType.STRING
import jakarta.persistence.Enumerated

@Entity(name = "tbl_user")
class User(
    @Column(columnDefinition = "VARCHAR(30)", nullable = false, unique = true)
    val accountId: String,

    @Column(columnDefinition = "CHAR(60)", nullable = false)
    val password: String,

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    val deviceToken: String,

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    @Enumerated(value = STRING)
    val authority: Authority,
) : BaseUUIDEntity()