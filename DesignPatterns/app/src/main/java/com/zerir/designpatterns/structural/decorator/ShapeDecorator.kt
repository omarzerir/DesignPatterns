package com.zerir.designpatterns.structural.decorator

sealed class ShapeDecorator(private val shape: Shape) : Shape {

    override fun draw() {
        this.shape.draw()
    }

    class RedShapeDecorator(shape: Shape) : ShapeDecorator(shape) {

        override fun draw() {
            super.draw()
            setBorder()
        }

        private fun setBorder() { println("Border: RED") }
    }


}
