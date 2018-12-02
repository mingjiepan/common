package com.mjie.delegate

import kotlin.reflect.KProperty

class MyClass5 {
    var name: String by MyDelegateClass()
}

class MyDelegateClass {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String = "$thisRef, property = ${property.name}"
    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) = println("$thisRef, property = ${property.name}, newValue = $newValue")
}

fun main(args: Array<String>) {
    var myClass5 = MyClass5()
    myClass5.name = "zhangsan"
    println(myClass5.name)
}