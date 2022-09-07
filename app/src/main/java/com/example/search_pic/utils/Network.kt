package com.example.search_pic.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

object Network {

    suspend fun  loadImageFromNetworkWithGlide(
        context:Context,
        imageURL: String,
        imageView: ImageView){
        Glide.with(context)
            .load(imageURL)
            .into(imageView)


    }
}