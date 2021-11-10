package com.zerir.designpatterns.structural.bridge

data class Circle(
    private val drawApi: DrawApi,
    private val radius: Int,
    private val x: Int,
    private val y: Int,
) : Shape(drawApi) {

    override fun draw() {
        drawApi.drawCircle(radius = radius, x = x, y = y)
    }
}