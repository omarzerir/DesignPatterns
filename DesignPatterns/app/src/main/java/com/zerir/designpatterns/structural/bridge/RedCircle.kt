package com.zerir.designpatterns.structural.bridge

class RedCircle : DrawApi {

    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Drawing circle with, Color: RED, Radius: $radius, at($x,$y)")
    }
}