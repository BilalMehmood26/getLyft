package com.usaclean.getlyftd.ui.vendor.profile

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
import com.usaclean.getlyftd.databinding.FragmentVenderProfileBinding
import com.usaclean.getlyftd.ui.onboarding.OnBoardingActivity

class VenderProfileFragment : Fragment() {

    companion object {
        fun newInstance() = VenderProfileFragment()
    }

    private lateinit var viewModel: VenderProfileViewModel

    private var _binding: FragmentVenderProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVenderProfileBinding.inflate(inflater)

        binding.apply {  editBtn.setOnClickListener {
            val action = VenderProfileFragmentDirections.actionVenderProfileFragmentToEditVendorProfileFragment()
            findNavController().navigate(action)
        }

            bankInfoCv.setOnClickListener {
                val action = VenderProfileFragmentDirections.actionVenderProfileFragmentToBankingInfoFragment3()
                findNavController().navigate(action)
            }

            contactUsCv.setOnClickListener {
                val action = VenderProfileFragmentDirections.actionVenderProfileFragmentToContactUsFragment3()
                findNavController().navigate(action)
            }
            deleteAccountCv.setOnClickListener {
                startActivity(Intent(requireActivity(),OnBoardingActivity::class.java))
                requireActivity().finish()
            }
        }
        return binding.root
    }
}