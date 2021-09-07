package com.example.activities


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class img (
    var src: Int?,
    var infoImage: String = "Nombre",
    var likeImage: Boolean = false
) : Parcelable{

    companion object {
        var arrayImages = arrayOf(
            img(R.drawable.ic_logo_puma, "Puma SVG"),
            img(R.drawable.ic_logo_under, "Under Armour SVG"),
            img(R.drawable.ic_logo_adidas, "Adidas SVG"),
            img(R.drawable.ic_logo_nike, "Nike SVG"),
            img(R.drawable.adidas,"Adidas PNG"),
            img(R.drawable.nike, "Nike PNG"),
        )


    }

}