package com.mjie.delegate

/*
属性代理：延迟代理
 */

class MyClass1 {
    val number: Int by  lazy {
        println("hello world")
        10
    }
    val number2: Int by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        20
    }
}

fun main(args: Array<String>) {
    var myClass1 = MyClass1()
    println(myClass1.number)
    println(myClass1.number)
    println(myClass1.number2)
}