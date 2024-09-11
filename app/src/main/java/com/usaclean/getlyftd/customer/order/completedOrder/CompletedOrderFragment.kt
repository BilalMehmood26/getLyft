package com.usaclean.getlyftd.customer.order.completedOrder

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.customer.order.OrderViewPagerAdapter
import com.usaclean.getlyftd.customer.shop.shopList.ShopAdapter
import com.usaclean.getlyftd.customer.shop.shopList.ShopFragmentDirections
import com.usaclean.getlyftd.databinding.FragmentCompletedOrderBinding
import com.usaclean.getlyftd.databinding.FragmentOrderBinding

class CompletedOrderFragment : Fragment() {

    companion object {
        fun newInstance() = CompletedOrderFragment()
    }


    private var _binding: FragmentCompletedOrderBinding? = null
    private val binding get() = _binding!!
    private lateinit var completedOrderAdapter: CompletedOrderAdapter

    private lateinit var viewModel: CompletedOrderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCompletedOrderBinding.inflate(inflater)
        binding.apply {

            completedOrderAdapter = CompletedOrderAdapter{
                findNavController().navigate(R.id.orderDetailsFragment)
            }
            completedRv.apply {
                adapter = completedOrderAdapter
                layoutManager = LinearLayoutManager(
                    requireActivity(),
                    LinearLayoutManager.VERTICAL, false
                )
            }
        }
        return binding.root
    }
}