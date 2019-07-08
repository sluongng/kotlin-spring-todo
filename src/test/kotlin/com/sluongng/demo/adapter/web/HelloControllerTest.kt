package com.sluongng.demo.adapter.web

import mu.KotlinLogging
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest(@Autowired val restTemplate: TestRestTemplate,
                          @Autowired val controller: HelloController) {

    private val log = KotlinLogging.logger {}

    @Test
    fun `hello api is working`() {
        val response = restTemplate.getForEntity<String>("/hello")

        assertThat(response).isNotNull
        assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(response.body).isEqualTo("hello world")

        log.info { "Test Done with status: ${response.statusCode} and response: ${response.body}" }
    }

    @Test
    fun `controller bean setup properly`() {
        assertThat(controller).isNotNull
    }
}