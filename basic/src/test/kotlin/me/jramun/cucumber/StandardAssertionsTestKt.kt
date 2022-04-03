package me.jramun.cucumber

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StandardAssertionsTestKt {

    @Test
    fun standardAssertions() {
        Assertions.assertEquals(2, 2)
        Assertions.assertTrue(
            true, "The optional assertion message is now the last parameter"
        )
        Assertions.assertFalse(false) { "Really " + "expensive " + "message" + "." }
    }

}