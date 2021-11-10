package com.zerir.designpatterns.creational.factory

fun main() {

    val factory = ShapeFactoryRandom()

    for(i in 0..10) {
        val randomShape = factory.generateShape()
        randomShape?.draw()
    }

}