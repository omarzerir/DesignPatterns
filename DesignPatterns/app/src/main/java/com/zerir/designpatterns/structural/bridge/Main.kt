package com.zerir.designpatterns.structural.bridge

fun main() {

    val redCircle = Circle(RedCircle(), radius = 100, x = 0, y = 10)
    val greenCircle = Circle(GreenCircle(), radius = 248, x = 15, y = -15)

    redCircle.draw()
    greenCircle.draw()

}