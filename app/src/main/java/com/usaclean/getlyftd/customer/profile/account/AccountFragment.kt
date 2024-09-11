package com.usaclean.getlyftd.customer.profile.account

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentAccountBinding
import com.usaclean.getlyftd.databinding.FragmentOnBoardingBinding
import com.usaclean.getlyftd.ui.onboarding.OnBoardingActivity

class AccountFragment : Fragment() {

    companion object {
        fun newInstance() = AccountFragment()
    }

    private lateinit var viewModel: AccountViewModel

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccountBinding.inflate(inflater)
        binding.apply {
            editBtn.setOnClickListener {
                val action = AccountFragmentDirections.actionAccountFragmentToEditProfileFragment()
                findNavController().navigate(action)
            }

            bankInfoCv.setOnClickListener {
                val action = AccountFragmentDirections.actionAccountFragmentToBankingInfoFragment()
                findNavController().navigate(action)
            }

            contactUsCv.setOnClickListener {
                val action = AccountFragmentDirections.actionAccountFragmentToContactUsFragment()
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