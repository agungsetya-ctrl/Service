package com.example.serdice5170411148

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.media.MediaPlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse
           ("http://www.facebook.com/langitinspirasi"))
            startActivity(i)
        })

        btn_ins.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse
                    ("http://www.instagram.com/langitinspirasi"))
            startActivity(i)
        })
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.icy)
        btn_play.setOnClickListener {
            MediaPlayer?.start()
        }
        btn_pause.setOnClickListener {
            MediaPlayer?.pause()
        }
        btn_stop.setOnClickListener {
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }

    }
}
