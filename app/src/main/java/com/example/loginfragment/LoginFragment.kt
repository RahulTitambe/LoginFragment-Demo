package com.example.loginfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.loginfragment.databinding.LoginLayoutBinding

class LoginFragment : Fragment() {

    private lateinit var binding : LoginLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = LoginLayoutBinding.inflate(layoutInflater)

        binding.cardLoginWithGoogle.setOnClickListener {
            Toast.makeText(context, "Loging In With Google", Toast.LENGTH_LONG).show()
        }

        binding.cardLoginWithFacebook.setOnClickListener {
            Toast.makeText(context, "Loging In With Facebook", Toast.LENGTH_LONG).show()
        }

        binding.cardLoginWithGitHub.setOnClickListener {
            Toast.makeText(context, "Loging In With GitHub", Toast.LENGTH_LONG).show()
        }

        binding.cardLoginWithTwitter.setOnClickListener {
            Toast.makeText(context, "Loging In With Twitter", Toast.LENGTH_LONG).show()
        }

        return binding.root
    }
}