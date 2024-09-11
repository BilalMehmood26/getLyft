package com.usaclean.getlyftd.ui.onboarding.auth.vendor.profileDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentSignupBinding
import com.usaclean.getlyftd.databinding.FragmentVendorProfileDetailsBinding

class VendorProfileDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = VendorProfileDetailsFragment()
    }

    private var _binding: FragmentVendorProfileDetailsBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: VendorProfileDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVendorProfileDetailsBinding.inflate(inflater)

        binding.apply {
            submitBtn.setOnClickListener {
                val action = VendorProfileDetailsFragmentDirections.actionVendorProfileDetailsFragmentToVerificationFragment("vendor")
                findNavController().navigate(action)
            }
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VendorProfileDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}