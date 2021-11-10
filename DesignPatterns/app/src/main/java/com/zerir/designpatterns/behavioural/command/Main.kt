package com.zerir.designpatterns.behavioural.command

fun main() {

    val lamp = Lamp()
    val remote = RemoteInvoker()

    val openCommand = OpenCommand(lamp)
    val closeCommand = CloseCommand(lamp)
    val changeColorCommand = ChangeColorCommand(lamp)

    remote.addCommand(openCommand)
    remote.addCommand(changeColorCommand)

    remote.placeOrders()

    remote.placeOrder(closeCommand)

}