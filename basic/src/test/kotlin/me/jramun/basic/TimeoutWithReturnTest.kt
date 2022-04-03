package me.jramun.basic

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles
import java.time.Duration

class TimeoutWithReturnTest {

    private val log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())

    @Test
    fun timeoutWithReturn1() {
        val actualResult = Assertions.assertTimeout<String>(
            Duration.ofMillis(100)
        ) { "hi" }
        Assertions.assertEquals("hi", actualResult)
    }
}