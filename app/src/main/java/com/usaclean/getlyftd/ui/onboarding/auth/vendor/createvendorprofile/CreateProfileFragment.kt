package com.usaclean.getlyftd.ui.onboarding.auth.vendor.createvendorprofile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentCreateProfileBinding

class CreateProfileFragment : Fragment() {

    companion object {
        fun newInstance() = CreateProfileFragment()
    }

    private lateinit var viewModel: CreateProfileViewModel
    private var _binding: FragmentCreateProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreateProfileBinding.inflate(inflater)
        binding.apply {
            signupBtn.setOnClickListener {
                val action = CreateProfileFragmentDirections.actionCreateProfileFragmentToVendorProfileDetailsFragment()
                findNavController().navigate(action)
            }
        }
        return binding.root
    }

}