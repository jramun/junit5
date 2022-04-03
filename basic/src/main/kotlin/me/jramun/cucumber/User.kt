package me.jramun.cucumber

class User() {

    var firstName: String = ""
    var lastName: String = ""

    constructor(firstName: String, lastName: String) : this() {
        this.firstName = firstName
        this.lastName = lastName
    }

    /**
     * If this function is called throw a runtime exception
     */

    companion object {
        fun get(username: String): User {
            throw RuntimeException()
        }
    }
}