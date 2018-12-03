package com.mjie.generic

class MyClass<T>(t: T) {
    val t: T = t
    fun getValue(): T = this.t
}


class MyClass2 {
    companion object {
        fun <T> sayHello(t: T) {
            println("hello $t")
        }
    }
}


fun main(args: Array<String>) {
    val myClass = MyClass("hello world")
    println(myClass.getValue())
    println("----")

    MyClass2.sayHello("zhangsan")
}