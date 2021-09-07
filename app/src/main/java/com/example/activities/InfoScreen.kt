package com.example.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InfoScreen : AppCompatActivity() {
    //lateinit var imgLike: ImageView
    lateinit var img: ImageView
    lateinit var txtInfo: TextView
    //lateinit var handler: Handler
    lateinit var image: img
    //var isDoubleClick: Boolean = false

    /*private val runnable = Runnable {
        isDoubleClick=false
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_screen)
        image = intent.getParcelableExtra<img>("imagen")!!
        //handler = Handler()
        initValues()
    }

    private fun initValues() {
        //imgLike = findViewById(R.id.like)
        img = findViewById(R.id.imageDetalle)
        txtInfo = findViewById(R.id.txtDetalle)

        /*(if ( image.likeImage )
            imgLike.setImageResource(R.drawable.star_yellow)
        else
            imgLike.setImageResource(R.drawable.star)*/

        img.setImageResource(image.src!!)
        txtInfo.text = image.infoImage
    }

    /*fun doubleClick(view: View) {
        if ( isDoubleClick ) {
            image.likeImage = true
            //imgLike.setImageResource(R.drawable.star_yellow)
            isDoubleClick = false
        } else {
            isDoubleClick = true
            handler.postDelayed(runnable, 500)
        }
    }*/

    fun viewImg(view: View) {
        startActivity(Intent(this, image_screen::class.java).apply {
            putExtra("image", image)
        })
    }
}