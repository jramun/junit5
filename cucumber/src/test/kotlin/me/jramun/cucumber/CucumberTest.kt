package me.jramun.cucumber

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles

class CucumberTest {
    private val log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())

    @Given("^Cucumber test is turned on$")
    fun setup() {
        this.log.debug("Cucumber test is turned on")
    }

    @When("^I add (\\d+) and (\\d+)\$")
    fun add(x: Int, y: Int) {
        this.log.debug("Adding {} and {}", x, y)
        Store.add(x, y)
    }

    @When("^I subtract (\\d+) and (\\d+)\$")
    fun subtract(x: Int, y: Int) {
        this.log.debug("Subtracting {} and {}", x, y)
        Store.subtract(x, y)
    }

    @Then("^the result is (\\d+)\$")
    fun result(x: Int) {
        this.log.debug("Result {} (expected {})", x, Store.value)
        Assertions.assertEquals(x, Store.value)
    }
}