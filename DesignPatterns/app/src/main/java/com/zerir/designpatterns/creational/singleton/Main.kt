package com.zerir.designpatterns.creational.singleton


fun main() {

    //creation will done once
    val singleton = Singleton
    val singleton2 = Singleton

    val singletonWithConstructor = SingletonWithConstructor.getInstance(120)
    //new data will not set
    val singletonWithConstructor2 = SingletonWithConstructor.getInstance(20)

    singleton.printData()
    singleton2.printData()

    singletonWithConstructor.printData()
    singletonWithConstructor2.printData()
}