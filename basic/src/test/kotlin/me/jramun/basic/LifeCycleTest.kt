package me.jramun.basic

import org.junit.jupiter.api.*
import org.junit.jupiter.api.TestInstance.Lifecycle
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles

@TestInstance(Lifecycle.PER_CLASS)
class LifeCycleTest {

    private val log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())

    @BeforeAll
    fun setupAll() {
        log.debug("BeforeAll")
    }

    @BeforeEach
    fun setup() {
        log.debug("BeforeEach")
    }

    @Test
    fun test1() {
        log.debug("Test [1]")
    }

    @Test
    fun test2() {
        log.debug("Test [2]")
    }

    @AfterEach
    fun teardown() {
        log.debug("AfterEach")
    }

    @AfterAll
    fun teardownAll() {
        log.debug("AfterAll")
    }
}