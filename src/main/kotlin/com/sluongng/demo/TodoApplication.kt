package com.sluongng.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.sluongng.demo"])
class TodoApplication

fun main(args: Array<String>) {
    runApplication<TodoApplication>(*args)
}
