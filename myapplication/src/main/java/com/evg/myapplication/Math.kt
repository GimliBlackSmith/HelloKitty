package com.evg.myapplication

import org.kotlinlang.play.com.evg.myapplication.First

class Math {
    fun main() {
        val print =  First()
        print.main()
        print.printMessage("Hello")                                          // 5
        print.printMessageWithPrefix("Hello", "Log")           // 6
        print.printMessageWithPrefix("Hello")                        // 7
        print.printMessageWithPrefix(prefix = "Log", message = "Hello")      // 8
        print.sum(1, 2)                                                // 9
        print.multiply(2, 4)                                           // 10
    }
}