package com.example.search_pic.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.search_pic.R

fun FragmentManager.navigateToFragment(fragment: Fragment) {
    this.beginTransaction()
        .replace(R.id.fragmentContainer, fragment)
        .commit()

}