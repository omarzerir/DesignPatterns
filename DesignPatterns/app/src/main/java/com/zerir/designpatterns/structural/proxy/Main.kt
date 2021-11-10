package com.zerir.designpatterns.structural.proxy

fun main() {

    val proxy = ImageProxy("example.txt")

    //will loading
    //then display
    proxy.display()

    //loading will not happen
    //just display
    proxy.display()

}