package com.mjie.delegate

import java.util.*

class MyClass2 (map: Map<String, Any?>){
    val name: String by map
    val age: Int by map
    val birthday: Date by map
}

class MyClass3(map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int by map
    var birthday: Date by map
}

fun main(args: Array<String>) {
    val map = mapOf(
            "name" to "zhangsan",
            "age" to 10,
            "birthday" to Date()
    )
    val myClass2 = MyClass2(map)
    println(myClass2.birthday)

    println("------------")

    val map2 = mutableMapOf<String, Any?>(
            "name" to "lisi",
            "age" to 20,
            "birthday" to Date()
    )
    val myClass3 = MyClass3(map2)

    map2["age"] = 30
    println(myClass3.name)
}