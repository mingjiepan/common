package com.mjie.delegate

import kotlin.properties.Delegates

class MyClass4 {
    var name: String by Delegates.observable("zhangsan", {property, oldValue, newValue ->
        println("property = ${property.name}, oldValue = $oldValue, newValue = $newValue")
    })

    var age: Int by Delegates.vetoable(10) {
        _, oldValue, newValue -> when {
            newValue > oldValue -> true
            else -> false
        }
    }
}

fun main(args: Array<String>) {
    val myClass4 = MyClass4()
    myClass4.name = "lisi"
    println(myClass4.name)

    println("-----------------------------")
    myClass4.age = 11
    myClass4.age = 8
    println(myClass4.age)
}




