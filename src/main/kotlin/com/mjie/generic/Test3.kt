package com.mjie.generic

//协变
class Producer<out T: Fruit>(private val t: T) {
    fun produce(): T {
        return this.t
    }
}

//逆变
class Consumer<in T: Fruit>(private var t: T) {
    fun consume(t: T) {
        this.t = t
    }
}

fun main(args: Array<String>) {
    val fruit = Fruit()
    val apple = Apple()
    var fruitProducer: Producer<Fruit> = Producer<Fruit>(fruit)
    var appleProducer: Producer<Apple> = Producer<Apple>(apple)

//    appleProducer = fruitProducer
    fruitProducer = appleProducer
    println("----------")

    var fruitConsumer: Consumer<Fruit> = Consumer(fruit)
    var appleConsumer: Consumer<Apple> = Consumer(apple)

//    fruitConsumer = appleConsumer
    appleConsumer = fruitConsumer

    println("-------------------")

    //星投影
    val pear = Pear()
    val pearProducer: Producer<*> = Producer(pear)
    println(pearProducer.produce())

    val pearConsumer: Consumer<*> = Consumer(pear)
//    pearConsumer.consume(pear)
}