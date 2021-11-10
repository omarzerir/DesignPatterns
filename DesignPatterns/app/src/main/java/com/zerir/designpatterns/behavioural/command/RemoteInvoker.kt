package com.zerir.designpatterns.behavioural.command

class RemoteInvoker {

    private val commands = mutableListOf<Order>()

    fun addCommand(order: Order) = commands.add(order)

    fun placeOrders() {
        commands.forEach { order -> order.execute() }
        commands.clear()
    }

    fun placeOrder(order: Order) = order.execute()

}