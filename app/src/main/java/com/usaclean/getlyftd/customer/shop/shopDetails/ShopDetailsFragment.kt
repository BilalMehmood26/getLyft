package com.usaclean.getlyftd.customer.shop.shopDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentAccountBinding
import com.usaclean.getlyftd.databinding.FragmentShopDetailsBinding
import com.usaclean.getlyftd.databinding.FragmentShopeBinding

class ShopDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = ShopDetailsFragment()
    }

    private var _binding: FragmentShopDetailsBinding? = null
    private val binding get() = _binding!!

    val productArray = arrayOf(
        "Product",
        "Review"
    )

    private lateinit var viewModel: ShopDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentShopDetailsBinding.inflate(inflater)
        binding.apply {
            val adapter = ViewPagerAdapter(childFragmentManager, lifecycle)
            viewPager.adapter = adapter

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = productArray[position]
            }.attach()
        }
        return binding.root
    }

}