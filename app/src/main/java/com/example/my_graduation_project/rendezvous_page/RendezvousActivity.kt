package com.example.my_graduation_project.rendezvous_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_graduation_project.rendezvous_page.ui.main.RendezvousFragment
import com.example.my_graduation_project.R

class RendezvousActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rendezvous_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, RendezvousFragment.newInstance())
                .commitNow()
        }
    }
}