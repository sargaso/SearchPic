package com.example.search_pic.utils

import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

fun Glide.loadImageFromNetwork(fragment: Fragment, imageURL:String, imageView: ImageView) {
    Glide.with(context)
        .load(imageURL)
        .into(imageView)
}