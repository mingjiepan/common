package com.mjie.lambda

fun main(args: Array<String>) {
    val link: String.(String) -> String = {(this + it).toLowerCase()}
    val result = "Hello".link("WORLD")
    println(result)

    println("---------------------")

    val sum = fun Int.(a: Int, b: Int): Int = this + a + b
    val number = 10
    val sum1 = number.sum(1, 2)
    println(sum1)
}