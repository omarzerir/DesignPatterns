package com.zerir.designpatterns.behavioural.command

class ChangeColorCommand(private val lamp: Lamp) : Order {

    override fun execute() {
        lamp.changeColor()
    }

}