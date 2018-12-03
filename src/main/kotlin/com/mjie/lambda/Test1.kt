package com.mjie.lambda

fun calculate(a: Int, b: Int, compute: (Int, Int) -> Int): Int {
    return compute(a, b)
}

fun main(args: Array<String>) {
    val add: (Int, Int) -> Int = {x, y -> x + y}
    val add2: (a: Int, b: Int) -> Int = {a, b -> a + b}

    var result = calculate(1, 2, add)
    println(result)
    result = com.mjie.lambda.calculate(1, 2, add2)
    println(result)
    println("-----------")

    result = calculate(1, 2, fun(a: Int, b: Int) : Int = a + b)
    println(result)
}