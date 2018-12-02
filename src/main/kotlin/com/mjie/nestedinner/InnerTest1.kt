package com.mjie.nestedinner

class OuterClass2 {
    val name: String = "hello world"

    inner class InnerClass {
        val address: String = "welcome"
        fun echo() {
            println("inner address = ${this.address}")
            println(this@OuterClass2.name)
        }
    }
}

fun main(args: Array<String>) {
    val innerClass: OuterClass2.InnerClass = OuterClass2().InnerClass()
    innerClass.echo()
}