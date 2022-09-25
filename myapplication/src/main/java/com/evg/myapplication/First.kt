package org.kotlinlang.play.com.evg.myapplication

class First {
    fun main() {
        println("Hello, World!")
    }

    fun printMessage(message: String): Unit {                               // 1
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
        println("[$prefix] $message")
    }

    fun sum(x: Int, y: Int): Int {                                          // 3
        return x + y
    }

    fun multiply(x: Int, y: Int) = x * y
}