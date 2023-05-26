package com.example.musicservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.musicservice.R.raw.*
import com.example.musicservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    var music= arrayOf(music1, music2, music3, music4, music5)
    var musicname= arrayOf("music1", "music2", "music3", "music4", "music5")
    var select=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.musiclist.adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,musicname)

        var musics=Intent(this,Musicservice::class.java).putExtra("music",music)

        binding.start.setOnClickListener {
            startService(Intent(this,Musicservice::class.java))
        }
        binding.stop.setOnClickListener {
            stopService(Intent(this,Musicservice::class.java))
        }








    }
}