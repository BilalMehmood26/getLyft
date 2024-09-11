package com.usaclean.getlyftd.ui.onboarding.auth.signup

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentLoginBinding
import com.usaclean.getlyftd.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    companion object {
        fun newInstance() = SignupFragment()
    }

    private val args : SignupFragmentArgs by  navArgs()
    private var _binding: FragmentSignupBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: SignupViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignupBinding.inflate(inflater)
        binding.apply {
            signupBtn.setOnClickListener {
                when(args.role){
                    "customer" ->{
                        val action = SignupFragmentDirections.actionSignupFragment3ToVerificationFragment("customer")
                        findNavController().navigate(action)
                    }
                    "driver" ->{
                        val action = SignupFragmentDirections.actionSignupFragment3ToCreateDriverProfileFragment()
                        findNavController().navigate(action)
                    }
                    "vendor" ->{
                        val action = SignupFragmentDirections.actionSignupFragment3ToCreateProfileFragment()
                        findNavController().navigate(action)
                    }
                }
            }
        }
        return binding.root
    }
}