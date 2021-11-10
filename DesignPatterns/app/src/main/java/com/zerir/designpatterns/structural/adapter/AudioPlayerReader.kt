package com.zerir.designpatterns.structural.adapter

class AudioPlayerReader : AdvancedMediaPlayer {

    override fun playVlc(audioName: String) {
        println("Playing Vlc $audioName")
    }

    override fun playMp4(audioName: String) {
        println("Playing Mp4 $audioName")
    }

}