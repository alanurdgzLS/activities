package com.example.activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    lateinit var btnNext: Button
    lateinit var btnBack: Button
    lateinit var btnInfo: Button
    lateinit var imageView: ImageView
    lateinit var arrayImages: Array<img>
    var index: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayImages = img.arrayImages
        initViews()
    }

    private fun initViews() {
        btnNext = findViewById(R.id.btnSig)
        btnBack = findViewById(R.id.btnAnt)
        btnInfo = findViewById(R.id.btnInfo)
        imageView = findViewById(R.id.imagePrincipal)
        imageView.setImageResource(arrayImages[index].src!!)
    }

    fun sigint(view: View) {
        if ( index == (arrayImages.size-1) )
            index = 0
        else
            index++

        cambiarImg()
    }

    fun anterior(view: View) {
        if ( index == 0 )
            index = arrayImages.size-1
        else
            index--

        cambiarImg()
    }

    fun detail(view: View) {
        startActivity(Intent(this, InfoScreen::class.java).apply
        {
            putExtra("imagen", arrayImages[index])
        })
    }

    private fun cambiarImg() {
        imageView.setImageResource(arrayImages[index].src!!)
    }


}