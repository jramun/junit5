package me.jramun.basic

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles

class ExceptionTest {

    private val log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())

    @Test
    fun exceptionTesting() {
        log.debug("Testing with assertThrow")
        assertThrows<RuntimeException> { User.get("test") }
    }
}