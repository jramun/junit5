package me.jramun.mockito

import org.springframework.stereotype.Repository

@Repository
class UserRepo {

    companion object {
        val users = arrayListOf<User>()

        init {
            users.add(User("Mojtaba", "123"))
            users.add(User("Sara", "123"))
            users.add(User("Reza", "123"))
        }
    }

    fun getUsers(): ArrayList<User> {
        return users
    }
}