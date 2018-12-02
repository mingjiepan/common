package com.mjie.nestedinner

class OuterClass {

    lateinit var name: String

    class NestedClass (name: String){
        val name: String = name
        fun method() {
            println(this.name)
        }
    }
}

fun main(args: Array<String>) {
    val nestedCLass: OuterClass.NestedClass = OuterClass.NestedClass("zhangsan")
    nestedCLass.method()
}