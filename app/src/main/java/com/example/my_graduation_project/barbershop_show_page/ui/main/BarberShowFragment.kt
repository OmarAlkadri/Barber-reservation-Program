package com.example.my_graduation_project.barbershop_show_page.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_graduation_project.R
import com.example.my_graduation_project.databinding.BarberShowFragmentBinding

class BarberShowFragment : Fragment() {

    companion object {
        fun newInstance() = BarberShowFragment()
    }

    private lateinit var viewModel: barber_show_ViewModel
    private lateinit var binding: BarberShowFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(barber_show_ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}