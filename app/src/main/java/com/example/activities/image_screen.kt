package com.example.activities

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class image_screen : AppCompatActivity() {

    lateinit var image: img
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_screen)

        initViews()
    }

    private fun initViews() {
        image = intent.getParcelableExtra("image")!!
        imageView = findViewById(R.id.imageVista)

        imageView.setImageResource(image.src!!)
    }


}