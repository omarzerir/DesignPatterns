package com.zerir.designpatterns.structural.adapter

fun main() {

    val defaultPlayer = AudioPlayer()

    val mp3File = "mp3FileName"
    val mp4File = "mp4FileName"
    val vlcFile = "vlcFileName"
    val hdFile = "hdFileName"

    defaultPlayer.play("mp3", mp3File)

    try {
        defaultPlayer.play("mp4", mp4File)
    } catch (e: UnKnownAudioTypeException) {
        println("$e for playing mp4")
    }

    try {
        defaultPlayer.play("vlc", vlcFile)
    } catch (e: UnKnownAudioTypeException) {
        println("$e for playing vlc")
    }

    val advancedMediaPlayer = AudioPlayerReader()
    defaultPlayer.mediaAdapter = MediaAdapter(advancedMediaPlayer)

    try {
        defaultPlayer.play("mp4", mp4File)
    } catch (e: UnKnownAudioTypeException) {
        println("$e for playing mp4")
    }

    try {
        defaultPlayer.play("vlc", vlcFile)
    } catch (e: UnKnownAudioTypeException) {
        println("$e for playing vlc")
    }

    try {
        defaultPlayer.play("hd", hdFile)
    } catch (e: UnKnownAudioTypeException) {
        println("$e for playing hd")
    }

}