package com.usaclean.getlyftd.ui.onboarding.auth.verification

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.customer.CustomerMainActivity
import com.usaclean.getlyftd.databinding.FragmentSignupBinding
import com.usaclean.getlyftd.databinding.FragmentVerificationBinding
import com.usaclean.getlyftd.ui.driver.DriverMainActivity
import com.usaclean.getlyftd.ui.onboarding.auth.signup.SignupFragmentArgs
import com.usaclean.getlyftd.ui.onboarding.auth.signup.SignupFragmentDirections
import com.usaclean.getlyftd.ui.vendor.VendorMainActivity

class VerificationFragment : Fragment() {

    companion object {
        fun newInstance() = VerificationFragment()
    }

    private val args : VerificationFragmentArgs by  navArgs()
    private var _binding: FragmentVerificationBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: VerificationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVerificationBinding.inflate(inflater)
        binding.apply {
            submitBtn.setOnClickListener {
                when(args.role){
                    "customer" ->{
                        startActivity(Intent(requireActivity(),CustomerMainActivity::class.java))
                    }
                    "driver" ->{
                        startActivity(Intent(requireActivity(),DriverMainActivity::class.java))
                    }
                    "vendor" ->{
                        startActivity(Intent(requireActivity(),VendorMainActivity::class.java))
                    }
                }
            }
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VerificationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}