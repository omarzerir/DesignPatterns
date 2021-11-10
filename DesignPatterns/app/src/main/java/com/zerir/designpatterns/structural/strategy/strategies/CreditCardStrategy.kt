package com.zerir.designpatterns.structural.strategy.strategies

data class CreditCardStrategy(
    private val name: String,
    private val cardNumber: String,
    private val cvv: String,
    private val expDate: String,
) : PaymentStrategy {

    override fun pay(amount: Int) {
        println("$amount has been paid by this $cardNumber creditCard")
    }

}
