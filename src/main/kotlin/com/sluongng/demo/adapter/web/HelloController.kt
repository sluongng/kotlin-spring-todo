package com.sluongng.demo.adapter.web

import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {
    private val log = KotlinLogging.logger {}

    @GetMapping
    fun hello(): String {
        log.info { "Hello World was invoked" }
        return "hello world"
    }
}