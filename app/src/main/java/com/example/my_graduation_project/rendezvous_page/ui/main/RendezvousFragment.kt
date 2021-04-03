package com.example.my_graduation_project.rendezvous_page.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_graduation_project.R

class RendezvousFragment : Fragment() {

    companion object {
        fun newInstance() = RendezvousFragment()
    }

    private lateinit var viewModel: rendezvous_ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.rendezvous_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(rendezvous_ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}