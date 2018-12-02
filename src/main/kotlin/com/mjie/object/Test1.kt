package com.mjie.`object`
/*
对象声明
 */
object MyObject {
    var name: String = "hello"
    fun echo() {
        println("name = ${this.name}")
    }
}

class MyClass {
    var name: String = "xiamen"
    /*
    伴生对象
     */
    companion object {
        val count = 1
        fun echo() {
            println("${this.count}")
        }
    }
}

interface MyInterface {
    fun echo()
}

object MyObjectImpl: MyInterface {
    override fun echo() {
        println("my object impl")
    }
}

fun main(args: Array<String>) {
    MyObject.echo()
    MyObject.name = "world"
    MyObject.echo()

    println("----------------------------")

    MyClass.echo()
    println("----------------")

    MyObjectImpl.echo()
}
