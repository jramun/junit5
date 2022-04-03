package me.jramun.mockito

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController {

    @Autowired
    lateinit var userService: UserService

    fun login(username: String, password: String): Int {
        var user: User? = this.userService.login(username, password) ?: return 404
        return 200
    }
}