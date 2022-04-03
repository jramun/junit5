package me.jramun.basic

import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.RepetitionInfo
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles

class RepetitionTest {
    private val log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())

    @RepeatedTest(3)
    fun test(repetition: RepetitionInfo) {
        log.debug("Test {} {}", repetition.currentRepetition, repetition.totalRepetitions)
    }

}