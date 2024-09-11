package com.usaclean.getlyftd.ui.onboarding.auth.createDriverProfile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentCreateDriverProfileBinding
import com.usaclean.getlyftd.databinding.FragmentCreateProfileBinding
import com.usaclean.getlyftd.databinding.FragmentSignupBinding
import com.usaclean.getlyftd.ui.onboarding.auth.signup.SignupFragmentArgs

class CreateDriverProfileFragment : Fragment() {

    companion object {
        fun newInstance() = CreateDriverProfileFragment()
    }

    private var _binding: FragmentCreateDriverProfileBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: CreateDriverProfileViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreateDriverProfileBinding.inflate(inflater)
        binding.apply {

            continueBtn.setOnClickListener {
                val action = CreateDriverProfileFragmentDirections.actionCreateDriverProfileFragmentToVerificationFragment("driver")
                findNavController().navigate(action)
            }
        }
        return binding.root
    }
}