package me.jramun.cucumber


class Store {
    companion object {
        var value: Int = 0

        fun add(x: Int, y: Int) {
            value = x + y
        }

        fun subtract(x: Int, y: Int) {
            value = x - y
        }

    }


}
