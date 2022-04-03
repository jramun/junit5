package me.jramun.basic


import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles.lookup

class AssertJTest {

    private val log = LoggerFactory.getLogger(lookup().lookupClass())

    @Test
    fun testOperation() {
        log.debug("Assertions using AssertJ")
        val sum = 1 + 1
        Assertions.assertThat(sum).isGreaterThan(1).isLessThan(3)
        Assertions.assertThat(sum).isEqualTo(2)
    }


}