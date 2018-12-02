package com.mjie.classes

open class Parent (name: String, age: Int) {
    open var name: String = name
    open val age: Int = age
    var address: String
    init {
        address = "beijing"
    }

    constructor(name:String, age: Int, address:String) : this(name, age) {
        this.address = address
    }

    open fun echo() {
        println("name = $name, age=$age, address=$address")
    }
}

class Child(name: String, age: Int): Parent(name, age) {
    override var name: String = name
    override var age: Int = age

    override fun echo() {
        println("name=$name, age=$age")
    }
}

fun main(args: Array<String>) {
    var child = Child("zhangsan", 20)
    child.echo()
}

