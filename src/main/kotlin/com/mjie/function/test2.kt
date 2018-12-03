package com.mjie.function

inline fun cal(a: Int, b: Int) = a + b

class MyClass(val name: String = "xiamen", val age: Int = 10) {

    inline fun echoName() {
        println(this.name)
    }

    infix fun echoAge(number: Int) {
        println(this.age + number)
    }
}

fun main(args: Array<String>) {
    cal(1, 2)
    val myClass = MyClass()
    myClass.echoName()
    myClass echoAge 10
}