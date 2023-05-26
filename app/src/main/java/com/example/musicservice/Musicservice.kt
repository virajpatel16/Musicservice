package com.example.musicservice

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class Musicservice: Service() {
lateinit var mp:MediaPlayer
    override fun onBind(intent: Intent?): IBinder? {
     return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

var mm=intent?.getIntExtra("music",0)
        mp= MediaPlayer.create(this,R.raw.music1)

        mp.isLooping=true
        mp.start()

        return  START_NOT_STICKY
    }

    override fun onDestroy() {
        mp.stop()
    }

}