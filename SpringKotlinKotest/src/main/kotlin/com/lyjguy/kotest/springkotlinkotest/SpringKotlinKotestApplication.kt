package com.lyjguy.kotest.springkotlinkotest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinKotestApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinKotestApplication>(*args)
}
