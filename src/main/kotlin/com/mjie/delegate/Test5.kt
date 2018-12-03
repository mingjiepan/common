package com.mjie.delegate

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class PersonDelegate: ReadOnlyProperty<Person, String> {
    override fun getValue(thisRef: Person, property: KProperty<*>): String {
        println("hello world")
        return "hello world"
    }
}

class ChooseDelegate {
    operator fun provideDelegate(thidRef: Person, property: KProperty<*>): ReadOnlyProperty<Person, String> {
        println(property.name)
        when (property.name){
            "name" -> return PersonDelegate()
            else -> throw Exception("not valid name")
        }
    }
}


class Person {
    val name: String by ChooseDelegate()
}


fun main(args: Array<String>) {
    val person = Person()
    println(person.name)
}