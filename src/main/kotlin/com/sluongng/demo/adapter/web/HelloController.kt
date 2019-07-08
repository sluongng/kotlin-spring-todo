package com.sluongng.demo.adapter.web

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    val logger = LoggerFactory.getLogger(this.javaClass)!!

    @GetMapping
    fun hello(): String {
        logger.info("hello() invoked")

        return "hello world"
    }
}