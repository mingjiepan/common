package com.mjie.generic

open class Fruit {
    open fun printName() {
        println("fruit")
    }
}

class Apple: Fruit() {
    override fun printName() {
        println("apple")
    }
}

class Pear: Fruit() {
    override fun printName() {
        println("pear")
    }
}

class KiwiFruit {
    fun printName() {
        println("kiwiFruit")
    }
}

class MyGeneric<T : Fruit>(private val t: T) {
    fun printFruitName() {
        t.printName()
    }
}

