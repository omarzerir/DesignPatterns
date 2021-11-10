package com.zerir.designpatterns.structural.bridge

class GreenCircle : DrawApi {

    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Drawing circle with, Color: Green, Radius: $radius, at($x,$y)")
    }
}