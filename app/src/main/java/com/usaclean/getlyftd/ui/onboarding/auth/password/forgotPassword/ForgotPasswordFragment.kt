package com.usaclean.getlyftd.ui.onboarding.auth.password.forgotPassword

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentForgotPasswordBinding

class ForgotPasswordFragment : Fragment() {

    companion object {
        fun newInstance() = ForgotPasswordFragment()
    }

    private lateinit var viewModel: ForgotPasswordViewModel

    private var _binding: FragmentForgotPasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentForgotPasswordBinding.inflate(inflater)
        binding.apply {
            submitBtn.setOnClickListener {
                val action = ForgotPasswordFragmentDirections.actionForgotPasswordFragmentToResetPasswordFragment()
                findNavController().navigate(action)
            }
        }
        return binding.root
    }
}