package me.jramun.basic

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestReporter

class TestReporterTest {

    @Test
    fun customReport(testReporter: TestReporter) {
        testReporter.publishEntry("my key", "my value :)")
    }

}