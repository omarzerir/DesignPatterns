package com.zerir.designpatterns.structural.strategy.clients

import com.zerir.designpatterns.structural.strategy.strategies.PaymentStrategy

class ShoppingCard {

    var amount = 0

    fun pay(paymentStrategy: PaymentStrategy) {
        paymentStrategy.pay(amount)
    }

}