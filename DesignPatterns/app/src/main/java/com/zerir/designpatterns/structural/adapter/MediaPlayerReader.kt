package com.zerir.designpatterns.structural.adapter

interface VlcReader {
    fun playVlc(audioName: String)
}

interface Mp4Reader {
    fun playMp4(audioName: String)
}

interface AdvancedMediaPlayer : Mp4Reader, VlcReader