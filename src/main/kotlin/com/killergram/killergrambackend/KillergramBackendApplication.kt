package com.killergram.killergrambackend

import com.killergram.killergrambackend.global.security.jwt.JwtProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(value = [ JwtProperties::class ])
class KillergramBackendApplication

fun main(args: Array<String>) {
    runApplication<KillergramBackendApplication>(*args)
}
