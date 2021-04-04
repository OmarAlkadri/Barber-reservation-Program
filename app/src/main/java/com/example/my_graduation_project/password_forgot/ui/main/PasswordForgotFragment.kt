package com.example.my_graduation_project.password_forgot.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_graduation_project.R

class PasswordForgotFragment : Fragment() {

    companion object {
        fun newInstance() = PasswordForgotFragment()
    }

    private lateinit var viewModel: password_forgot_ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.password_forgot_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(password_forgot_ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}