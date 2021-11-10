package com.zerir.designpatterns.structural.strategy.strategies

data class PaypalStrategy(
    private val email: String,
    private val password: String,
) : PaymentStrategy {

    override fun pay(amount: Int) {
        println("$amount has been paid by this $email paypal account")
    }
}
