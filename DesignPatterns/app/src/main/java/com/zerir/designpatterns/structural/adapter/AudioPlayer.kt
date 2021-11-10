package com.zerir.designpatterns.structural.adapter

import java.lang.Exception
import kotlin.jvm.Throws

class AudioPlayer(var mediaAdapter: MediaAdapter? = null) : MediaPlayer {

    @Throws(UnKnownAudioTypeException::class)
    override fun play(audioType: String, audioName: String) {
        if("mp3" == audioType) println("Playing Mp3 $audioName")
        else
            this.mediaAdapter?.play(audioType, audioName) ?:
                throw UnKnownAudioTypeException("UnKnown Media Type")
    }
}

class UnKnownAudioTypeException(message: String) : Exception(message)