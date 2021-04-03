package com.example.my_graduation_project.barbershop_show_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_graduation_project.R
import com.example.my_graduation_project.barbershop_show_page.ui.main.BarberShowFragment

class Barber_Show_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.barber_show_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, BarberShowFragment.newInstance())
                .commitNow()
        }
    }
}