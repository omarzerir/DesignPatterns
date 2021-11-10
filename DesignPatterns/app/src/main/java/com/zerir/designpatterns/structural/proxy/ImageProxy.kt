package com.zerir.designpatterns.structural.proxy

class ImageProxy(private val fileName: String) : ImageDisplay {

    private var image: Image? = null

    override fun display() {
        if (image == null) image = Image(fileName)
        image?.display()
    }

}