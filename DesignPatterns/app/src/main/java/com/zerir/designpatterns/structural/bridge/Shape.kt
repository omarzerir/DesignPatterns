package com.zerir.designpatterns.structural.bridge

abstract class Shape(private val drawApi: DrawApi) {
    abstract fun draw()
}
