package com.mjie.enums

enum class MyEnum(val code: Int, val value: String) {

    HELLO(1, "BEIJING"){
        override fun echo(): String = this.value
    },
    WORLD(2, "SHANGHAI") {
        override fun echo(): String {
            println("world")
            return this.code.toString()
        }
    }
    ;
    abstract fun echo(): String
}


fun main(args: Array<String>) {
    val result = MyEnum.HELLO.echo()
    println(result)
}