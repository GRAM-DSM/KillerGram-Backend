package com.killergram.killergrambackend.domain.sport.domain

import com.killergram.killergrambackend.global.entity.BaseUUIDEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType.STRING
import jakarta.persistence.Enumerated
import java.time.DayOfWeek

@Entity(name = "tbl_sport")
class Sport(
    @Column(columnDefinition = "VARCHAR(30)", nullable = false)
    val name: String,

    @Column(columnDefinition = "INT(2)", nullable = false, unique = true)
    val headcount: Int,

    @Column(columnDefinition = "VARCHAR(9)", nullable = false)
    @Enumerated(value = STRING)
    val dayOfWeek: DayOfWeek,
) : BaseUUIDEntity()