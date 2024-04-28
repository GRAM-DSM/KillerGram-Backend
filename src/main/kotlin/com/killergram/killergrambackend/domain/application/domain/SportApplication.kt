package com.killergram.killergrambackend.domain.application.domain

import com.killergram.killergrambackend.domain.sport.domain.Sport
import com.killergram.killergrambackend.global.entity.BaseUUIDEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType.LAZY
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.Date

@Entity(name = "tbl_sport_application")
class SportApplication(
    @Column(columnDefinition = "DATE(8)", nullable = false)
    val date: Date,

    sport: Sport,
) : BaseUUIDEntity() {
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "sport_id", columnDefinition = "BINARY(16)", nullable = false)
    var sport = sport
        protected set
}