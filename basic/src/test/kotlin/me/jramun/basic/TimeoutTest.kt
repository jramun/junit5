package me.jramun.basic

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.time.Duration

class TimeoutTest {

    @Disabled("Skipped")
    @Test
    fun timeout() {
        Assertions.assertTimeout(Duration.ofMillis(10)) {
            // Perform task that takes less than x millis
            Thread.sleep(10)
        }
    }
}