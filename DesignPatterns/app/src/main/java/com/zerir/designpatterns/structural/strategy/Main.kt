package com.zerir.designpatterns.structural.strategy

import com.zerir.designpatterns.structural.strategy.clients.ShoppingCard
import com.zerir.designpatterns.structural.strategy.strategies.CreditCardStrategy
import com.zerir.designpatterns.structural.strategy.strategies.PaypalStrategy

fun main() {

    val shoppingCard = ShoppingCard()
    shoppingCard.amount = 270

    // Do payment with credit card
    shoppingCard.pay(CreditCardStrategy(
        name = "Client",
        cardNumber = "1234 1234 1234 1234",
        cvv = "123",
        expDate = "dd/yyyy"
    ))

    //OR
    // Do Payment with paypal
    shoppingCard.pay(
        PaypalStrategy(
            email = "example@example.co",
            password = "********",
        )
    )

}