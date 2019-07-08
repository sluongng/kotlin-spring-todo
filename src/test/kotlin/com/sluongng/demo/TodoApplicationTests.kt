package com.sluongng.demo

import org.junit.jupiter.api.Test

class TodoApplicationTests {

    @Test
    fun `main run successfully`() {
        TodoApplication().run { main(emptyArray()) }
    }
}
