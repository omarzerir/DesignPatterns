package com.zerir.designpatterns.behavioural.command

class CloseCommand(private val lamp: Lamp) : Order{

    override fun execute() {
        lamp.close()
    }

}