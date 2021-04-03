package com.example.my_graduation_project.sign_up

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_graduation_project.sign_up.ui.main.SignUpFragment
import com.example.my_graduation_project.R


class Sign_up_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SignUpFragment.newInstance())
                .commitNow()
        }
    }
}