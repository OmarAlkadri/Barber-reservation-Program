package com.example.my_graduation_project.password_forgot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_graduation_project.R
import com.example.my_graduation_project.password_forgot.ui.main.PasswordForgotFragment

class Password_Forgot_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.password_forgot_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PasswordForgotFragment.newInstance())
                .commitNow()
        }
    }
}