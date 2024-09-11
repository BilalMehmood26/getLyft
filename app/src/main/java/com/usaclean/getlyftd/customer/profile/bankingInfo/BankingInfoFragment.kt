package com.usaclean.getlyftd.customer.profile.bankingInfo

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentBankingInfoBinding
import com.usaclean.getlyftd.databinding.FragmentContactUsBinding

class BankingInfoFragment : Fragment() {

    companion object {
        fun newInstance() = BankingInfoFragment()
    }

    private var _binding: FragmentBankingInfoBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: BankingInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBankingInfoBinding.inflate(inflater)
        binding.apply {
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
        }
        return binding.root
    }
}