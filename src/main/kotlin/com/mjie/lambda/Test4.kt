package com.mjie.lambda

//Int.(Int) -> Int与 (Int, Int) -> Int 等价
fun cal(a: Int, b: Int, compute: Int.(Int) -> Int): Int {
    return a.compute(b)
}

fun main(args: Array<String>) {
    val compute: (Int, Int) -> Int = {a, b -> a * b}
    val cal = cal(2, 4, compute)
    println(cal)
}