package com.zerir.designpatterns.behavioural.command

class OpenCommand(private val lamp: Lamp) : Order{

    override fun execute() {
        lamp.open()
    }

}