package com.example.search_pic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.search_pic.presentation.MainFragment
import com.example.search_pic.utils.navigateToFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .navigateToFragment(fragment = MainFragment())
    }
}