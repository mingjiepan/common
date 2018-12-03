package com.mjie.function

fun add(a: Int, b: Int) = a + b

fun substract(a: Int = 1, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int = 2): Int = a * b

fun main(args: Array<String>) {
    add(1, 2)
    substract(b = 2)
    multiply(1)
}