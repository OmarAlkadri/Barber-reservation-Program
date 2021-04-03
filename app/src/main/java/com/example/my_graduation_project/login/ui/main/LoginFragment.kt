package com.example.my_graduation_project.login.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.my_graduation_project.R
import com.example.my_graduation_project.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: login_ViewModel
    private lateinit var binding: LoginFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.login_fragment, container, false)

        binding.TextPassword.setOnClickListener(){
            findNavController().navigate(R.id.action_loginFragment_to_password_Forgot_Fragment)

        }

        binding.button2.setOnClickListener(){
            //Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_rendezvousFragment);
            findNavController().navigate(R.id.action_loginFragment_to_lodingFragment)
        }
        binding.newUserImg.setOnClickListener(){
            //Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_rendezvousFragment);
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }
        binding.newUserBtn.setOnClickListener(){
            //Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_rendezvousFragment);
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(login_ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}