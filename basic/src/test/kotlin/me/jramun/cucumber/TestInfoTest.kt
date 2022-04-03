package me.jramun.cucumber

import org.junit.jupiter.api.*
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestInfoTest {

    private val log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())

    @BeforeAll
    fun setup(testInfo: TestInfo) {
        log.debug("BeforeAll {}", testInfo.displayName)
    }

    @Test
    @DisplayName("Test first")
    @Tag("tag1")
    fun test1(testInfo: TestInfo) {
        log.debug("Display name {}", testInfo.displayName)
        log.debug("Tags {}", testInfo.tags)
        log.debug("Test class {}", testInfo.testClass)
        log.debug("Test method {}", testInfo.testMethod)
    }

    @Test
    @DisplayName("Test second")
    @Tag("tag2")
    fun test2() {
    }
}