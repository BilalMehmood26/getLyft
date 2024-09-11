package com.usaclean.getlyftd.customer.order.orderDetail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentOrderBinding
import com.usaclean.getlyftd.databinding.FragmentOrderDetailsBinding

class OrderDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = OrderDetailsFragment()
    }


    private var _binding: FragmentOrderDetailsBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: OrderDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOrderDetailsBinding.inflate(inflater)
        binding.apply {
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }

            trackBtn.setOnClickListener {
                val action = OrderDetailsFragmentDirections.actionOrderDetailsFragmentToTrackOrderFragment()
                findNavController().navigate(action)
            }
        }
        return binding.root
    }
}