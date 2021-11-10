package com.zerir.designpatterns.structural.proxy

class Image(private val fileName: String) : ImageDisplay {

    init {
        loadFromDisk(fileName)
    }

    override fun display() {
        println("Display $fileName")
    }

    private fun loadFromDisk(fileName: String) {
        println("Loading... $fileName")
    }

}