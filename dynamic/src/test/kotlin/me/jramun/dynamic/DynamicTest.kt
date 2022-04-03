package me.jramun.dynamic

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles
import java.util.stream.Stream

class DynamicTest {

    private val log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())

    @TestFactory
    fun dynamicTestsFromStream(): List<DynamicTest>? {
        val inputStream = Stream.of("A", "B", "C")
        return inputStream.map { input: String ->
            DynamicTest.dynamicTest(
                "Display name for input $input"
            ) {
                log.debug(
                    "Testing {}", input
                )
            }
        }.toList()
    }
}