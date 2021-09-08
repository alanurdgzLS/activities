package com.example.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class info_screen : AppCompatActivity() {


    lateinit var img: ImageView
    lateinit var txtInfo: TextView
    lateinit var handler: Handler
    lateinit var image: img

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_screen)
        image = intent.getParcelableExtra<img>("imagen")!!
        handler = Handler()
        initValues()
    }

    private fun initValues() {
        img = findViewById(R.id.imageDetalle)
        txtInfo = findViewById(R.id.txtDetalle)
        img.setImageResource(image.src!!)
        txtInfo.text = image.infoImage
    }

    fun viewImg(view: View) {
        startActivity(Intent(this, image_screen::class.java).apply {
            putExtra("image", image)
        })
    }

}