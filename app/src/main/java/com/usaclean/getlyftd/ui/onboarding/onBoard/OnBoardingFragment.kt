package com.usaclean.getlyftd.ui.onboarding.onBoard

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentOnBoardingBinding

class OnBoardingFragment : Fragment() {

    companion object {
        fun newInstance() = OnBoardingFragment()
    }

    private var _binding: FragmentOnBoardingBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: OnBoardingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnBoardingBinding.inflate(inflater)
        binding.apply {

            customerCv.setOnClickListener {
               navigateToSignup("customer")
            }

            driverCv.setOnClickListener {
                navigateToSignup("driver")
            }

            venderCv.setOnClickListener {
                navigateToSignup("vendor")
            }
        }
        return binding.root
    }

    private fun navigateToSignup(role:String){
        val action  = OnBoardingFragmentDirections.actionOnBoardingFragmentToLoginFragment3(role)
        findNavController().navigate(action)
    }
}