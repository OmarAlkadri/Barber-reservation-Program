package com.example.my_graduation_project.sign_up.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.my_graduation_project.R
import com.example.my_graduation_project.databinding.SignUpFragmentBinding

class SignUpFragment : Fragment() {

    companion object {
        fun newInstance() = SignUpFragment()
    }

    private lateinit var viewModel: sign_up_ViewModel
    private lateinit var binding: SignUpFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.sign_up_fragment, container, false)

        binding.cirRegisterBtn.setOnClickListener(){
            findNavController().navigate(R.id.action_signUpFragment_to_lodingFragment)
        }

        binding.btn.setOnClickListener(){
            findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(sign_up_ViewModel::class.java)


    // TODO: Use the ViewModel
    }

}