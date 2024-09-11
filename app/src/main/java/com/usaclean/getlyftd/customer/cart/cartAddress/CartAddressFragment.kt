package com.usaclean.getlyftd.customer.cart.cartAddress

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentCartAddressBinding
import com.usaclean.getlyftd.databinding.FragmentCartBinding

class CartAddressFragment : Fragment() {

    companion object {
        fun newInstance() = CartAddressFragment()
    }

    private var _binding: FragmentCartAddressBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: CartAddressViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCartAddressBinding.inflate(inflater)
        binding.apply {

            continueBtn.setOnClickListener {
                val action = CartAddressFragmentDirections.actionCartAddressFragmentToPaymentFragment()
                findNavController().navigate(action)
            }

            newAddressBtn.setOnClickListener {
                val action = CartAddressFragmentDirections.actionCartAddressFragmentToNewAddressFragment()
                findNavController().navigate(action)
            }

            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
        }
        return binding.root
    }
}