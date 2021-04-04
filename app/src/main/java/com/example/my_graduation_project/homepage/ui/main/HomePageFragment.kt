package com.example.my_graduation_project.homepage.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_graduation_project.R
import com.example.my_graduation_project.databinding.HomePageFragmentBinding

class HomePageFragment : Fragment() {

    companion object {
        fun newInstance() = HomePageFragment()
    }

    private lateinit var viewModel: home_page_ViewModel
    private lateinit var binding : HomePageFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(home_page_ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}