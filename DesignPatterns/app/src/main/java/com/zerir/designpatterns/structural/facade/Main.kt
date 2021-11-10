package com.zerir.designpatterns.structural.facade

fun main() {

    val maker = ShapeMaker()

    maker.drawCircle()
    maker.drawRectangle()
    maker.drawSquare()
}