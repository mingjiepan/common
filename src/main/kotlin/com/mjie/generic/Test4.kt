package com.mjie.generic

interface MyInterface1

interface MyInterface2

class MyClass3<T> where T : MyInterface1, T : MyInterface2

class MyInterfaceImpl : MyInterface1, MyInterface2

fun main(args: Array<String>) {
    val myClass3 = MyClass3<MyInterfaceImpl>()
}