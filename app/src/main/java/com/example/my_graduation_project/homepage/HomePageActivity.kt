package com.example.my_graduation_project.homepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_graduation_project.homepage.ui.main.HomePageFragment
import com.example.my_graduation_project.R


class HomePageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomePageFragment.newInstance())
                .commitNow()
        }
    }
}