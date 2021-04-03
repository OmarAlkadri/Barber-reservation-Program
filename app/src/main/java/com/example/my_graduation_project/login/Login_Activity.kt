package com.example.my_graduation_project.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_graduation_project.login.ui.main.LoginFragment
import com.example.my_graduation_project.R


class Login_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginFragment.newInstance())
                .commitNow()
        }
    }
}