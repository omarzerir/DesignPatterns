package com.zerir.designpatterns.creational.factory

class ShapeFactoryRandom : ShapeFactory {

    override fun generateShape(): Shape? {
        return when((1..3).random()) {
            1 -> createCircle()
            2 -> createSquare()
            3 -> createRectangle()
            else -> null
        }
    }

    private fun createCircle() = Circle()
    private fun createSquare() = Square()
    private fun createRectangle() = Rectangle()

}