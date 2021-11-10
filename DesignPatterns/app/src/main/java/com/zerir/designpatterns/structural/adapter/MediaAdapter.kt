package com.zerir.designpatterns.structural.adapter

import kotlin.jvm.Throws

class MediaAdapter(private val advancedMediaPlayer: AdvancedMediaPlayer) : MediaPlayer {

    @Throws(UnKnownAudioTypeException::class)
    override fun play(audioType: String, audioName: String) {
        when (audioType) {
            "mp4" -> {
                advancedMediaPlayer.playMp4(audioName)
            }
            "vlc" -> {
                advancedMediaPlayer.playVlc(audioName)
            }
            else -> {
                throw UnKnownAudioTypeException("UnKnown Media Type")
            }
        }
    }

}