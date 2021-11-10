package com.zerir.designpatterns.creational.singleton

class SingletonWithConstructor private constructor(private val data: Any) {

    init {
        println("SingletonWithConstructor Initialization")
    }

    companion object {
        // @Volatile insure that changes in a variable will immediately visible to other threads
        @Volatile
        private var instance: SingletonWithConstructor? = null

        fun getInstance(data: Any): SingletonWithConstructor =
            instance ?: synchronized(this) {
                instance ?: SingletonWithConstructor(data).also { instance = it }
            }
    }

    fun printData() = println("SingletonWithConstructor Data: $data")
}