package com.zerir.designpatterns.structural.decorator

fun main() {

    val circle: Shape = Circle()
    val redCircle: Shape = ShapeDecorator.RedShapeDecorator(Circle())

    val rectangle: Shape = Rectangle()
    val redRectangle: Shape = ShapeDecorator.RedShapeDecorator(Rectangle())

    circle.draw()
    println()
    redCircle.draw()
    println()
    rectangle.draw()
    println()
    redRectangle.draw()
}