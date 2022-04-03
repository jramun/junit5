package me.jramun.basic

import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

class HamcrestTest {

    @Test
    fun hamcrestMatcher() {
        assertThat(2 + 1, equalTo(3))
        assertThat("Hi", notNullValue())
        assertThat("Hello world", containsString("world"))
    }
}