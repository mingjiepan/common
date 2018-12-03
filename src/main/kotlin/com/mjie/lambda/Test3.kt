package com.mjie.lambda

fun main(args: Array<String>) {
    val arr = arrayOf("hello", "world", "welcome", "helloworld")

    arr.filter { it.length > 6 }.forEach { println(it) }
    println("------")

    arr.filter {
        val result = it.endsWith("d")
        return@filter result
    }.forEach { println(it) }
}