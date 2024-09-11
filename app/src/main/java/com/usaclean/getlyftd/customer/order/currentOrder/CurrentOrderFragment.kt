package com.usaclean.getlyftd.customer.order.currentOrder

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.customer.order.completedOrder.CompletedOrderAdapter
import com.usaclean.getlyftd.databinding.FragmentCompletedOrderBinding
import com.usaclean.getlyftd.databinding.FragmentCurrentOrderBinding

class CurrentOrderFragment : Fragment() {

    companion object {
        fun newInstance() = CurrentOrderFragment()
    }

    private lateinit var viewModel: CurrentOrderViewModel

    private var _binding: FragmentCurrentOrderBinding? = null
    private val binding get() = _binding!!
    private lateinit var currentOrderAdapter: CurrentOrderAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCurrentOrderBinding.inflate(inflater)
        binding.apply {

            currentOrderAdapter = CurrentOrderAdapter{
                        findNavController().navigate(R.id.orderDetailsFragment)
            }
            currentRv.apply {
                adapter = currentOrderAdapter
                layoutManager = LinearLayoutManager(
                    requireActivity(),
                    LinearLayoutManager.VERTICAL, false
                )
            }
        }
        return binding.root
    }
}