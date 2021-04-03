package com.example.my_graduation_project.payment_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_graduation_project.payment_page.ui.main.PaymentFragment
import com.example.my_graduation_project.R


class Payment_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PaymentFragment.newInstance())
                .commitNow()
        }
    }
}