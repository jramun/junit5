package me.jramun.mockito

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MockitoTest {


    @InjectMocks
    lateinit var userController: UserController

    @Mock
    lateinit var userService: UserService

    @BeforeAll
    fun setup() {
        MockitoAnnotations.openMocks(this)
    }


    @Test
    fun login() {
        val user = User("Mojtaba", "Sharif")
        `when`(this.userService.login("1", "2")).thenReturn(user)
        Assertions.assertEquals(200, this.userController.login("1", "2"))
    }


}