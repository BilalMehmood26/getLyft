package com.usaclean.getlyftd.ui.driver.wallet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentDriverOrderBinding
import com.usaclean.getlyftd.databinding.FragmentWalletBinding
import com.usaclean.getlyftd.ui.driver.driverOrder.DriverOrderFragmentDirections
import com.usaclean.getlyftd.ui.driver.driverOrder.NewOrderAdapter

class WalletFragment : Fragment() {

    companion object {
        fun newInstance() = WalletFragment()
    }

    private var _binding: FragmentWalletBinding? = null
    private val binding get() = _binding!!

    private lateinit var walletAdpater: WalletAdpater

    private lateinit var viewModel: WalletViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWalletBinding.inflate(inflater)
        binding.apply {
            walletAdpater = WalletAdpater {

            }

            walletRv.apply {
                adapter = walletAdpater
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            }
        }
        return binding.root
    }

}