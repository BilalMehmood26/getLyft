package com.usaclean.getlyftd.customer.order

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayoutMediator
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.customer.shop.shopDetails.ViewPagerAdapter
import com.usaclean.getlyftd.databinding.FragmentOrderBinding
import com.usaclean.getlyftd.databinding.FragmentShopDetailsBinding

class OrderFragment : Fragment() {

    companion object {
        fun newInstance() = OrderFragment()
    }

    val orderArray = arrayOf(
        "Current",
        "Completed"
    )

    private var _binding: FragmentOrderBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: OrderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOrderBinding.inflate(inflater)
        binding.apply {
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
            val adapter = OrderViewPagerAdapter(childFragmentManager, lifecycle)
            viewPager.adapter = adapter

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = orderArray[position]
            }.attach()
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OrderViewModel::class.java)
        // TODO: Use the ViewModel
    }

}