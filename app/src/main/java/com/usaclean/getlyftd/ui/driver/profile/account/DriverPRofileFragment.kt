package com.usaclean.getlyftd.ui.driver.profile.account

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.customer.profile.account.AccountFragmentDirections
import com.usaclean.getlyftd.databinding.FragmentAccountBinding
import com.usaclean.getlyftd.databinding.FragmentDriverPRofileBinding
import com.usaclean.getlyftd.ui.onboarding.OnBoardingActivity

class DriverPRofileFragment : Fragment() {

    companion object {
        fun newInstance() = DriverPRofileFragment()
    }

    private var _binding: FragmentDriverPRofileBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: DriverPRofileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDriverPRofileBinding.inflate(inflater)
        binding.apply {
            editBtn.setOnClickListener {
                val action = DriverPRofileFragmentDirections.actionDriverPRofileFragmentToEditDriverProfileFragment()
                findNavController().navigate(action)
            }

            bankInfoCv.setOnClickListener {
                val action = DriverPRofileFragmentDirections.actionDriverPRofileFragmentToBankingInfoFragment2()
                findNavController().navigate(action)
            }

            contactUsCv.setOnClickListener {
                val action = DriverPRofileFragmentDirections.actionDriverPRofileFragmentToContactUsFragment2()
                findNavController().navigate(action)
            }
            logoutCv.setOnClickListener {
                startActivity(Intent(requireActivity(), OnBoardingActivity::class.java))
                requireActivity().finishAffinity()
            }
        }
        return binding.root
    }
}