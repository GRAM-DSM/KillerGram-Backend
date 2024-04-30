package com.killergram.killergrambackend.domain.sport.domain

import com.killergram.killergrambackend.domain.user.domain.type.Ability
import com.killergram.killergrambackend.global.entity.BaseUUIDEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType.STRING
import jakarta.persistence.Enumerated
import jakarta.persistence.FetchType.LAZY
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "tbl_sport_condition")
class SportCondition(
    @Column(columnDefinition = "VARCHAR(30)", nullable = false)
    val name: String,

    @Column(columnDefinition = "INT(2)", nullable = false)
    val maxNumber: Int,

    @Column(columnDefinition = "VARCHAR(30)", nullable = false)
    @Enumerated(value = STRING)
    val ability: Ability,

    sport: Sport
) : BaseUUIDEntity() {
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "sport_id", columnDefinition = "BINARY(16)", nullable = false)
    var sport = sport
        protected set
}