package me.jramun.basic

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("A special test case")
internal class DisplayNameTest {

    @Test
    @DisplayName("Custom test name containing spaces")
    fun testWithDisplayNameContainingSpaces() {
        // TODO
    }

    @Test
    @DisplayName("🍎")
    fun testWithDisplayNameContainingEmoji() {
        // TODO
    }
}