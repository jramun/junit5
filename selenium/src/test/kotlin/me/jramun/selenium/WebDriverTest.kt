package me.jramun.selenium

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.openqa.selenium.chrome.ChromeDriver

class WebDriverTest {

    @Test
    fun withChrome(driver: ChromeDriver) {
        driver["https://www.google.com/"]
        Assertions.assertTrue(driver.title.contains("Google"))
    }
}