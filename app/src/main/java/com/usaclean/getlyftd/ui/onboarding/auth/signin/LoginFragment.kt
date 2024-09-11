package com.usaclean.getlyftd.ui.onboarding.auth.signin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.usaclean.getlyftd.customer.CustomerMainActivity
import com.usaclean.getlyftd.databinding.FragmentLoginBinding
import com.usaclean.getlyftd.ui.driver.DriverMainActivity
import com.usaclean.getlyftd.ui.onboarding.auth.signup.SignupFragmentDirections
import com.usaclean.getlyftd.ui.vendor.VendorMainActivity

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private val args : LoginFragmentArgs by  navArgs()
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater)
        binding.apply {
            signInBtn.setOnClickListener {
                when(args.role){
                    "customer" ->{
                        startActivity(Intent(requireContext(),CustomerMainActivity::class.java))
                    }
                    "driver" ->{
                        startActivity(Intent(requireContext(),DriverMainActivity::class.java))
                    }
                    "vendor" ->{
                        startActivity(Intent(requireContext(),VendorMainActivity::class.java))
                    }
                }
            }

            signUpBtn.setOnClickListener {
                val action = LoginFragmentDirections.actionLoginFragment3ToSignupFragment3(args.role)
                findNavController().navigate(action)
            }

            forgotPasswordTv.setOnClickListener {
                val action = LoginFragmentDirections.actionLoginFragment3ToForgotPasswordFragment()
                findNavController().navigate(action)
            }
        }
        return binding.root
    }
}