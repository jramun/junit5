package me.jramun.cucumber

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles.lookup


class TruthTest {

    private val log = LoggerFactory.getLogger(lookup().lookupClass())

    @Test
    fun test() {
        val sum = 1 + 1
        assertThat(sum).isEqualTo(2)
    }
}