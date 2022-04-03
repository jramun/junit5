package me.jramun.basic

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles

class GroupedAssertionsTest {

    private val log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())

    @Test
    fun groupedAssertions() {
        val user = User("Mojtaba", "Sharif")
        assertAll(
            "user",
            { Assertions.assertEquals("Mojtaba", user.firstName) },
            { Assertions.assertEquals("Sharif", user.lastName) }
        )
    }
}