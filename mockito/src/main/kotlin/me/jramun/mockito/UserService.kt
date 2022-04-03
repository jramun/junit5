package me.jramun.mockito

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepo: UserRepo

    fun login(username: String, password: String): User? {
        this.userRepo.getUsers().forEach {
            if (it.username == username && it.password == password) return it
        }
        return null
    }
}