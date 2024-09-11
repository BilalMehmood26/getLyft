package com.usaclean.getlyftd.customer.shop.shopList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.usaclean.getlyftd.databinding.FragmentShopeBinding

class ShopFragment : Fragment() {

    companion object {
        fun newInstance() = ShopFragment()
    }

    private var _binding: FragmentShopeBinding? = null
    private val binding get() = _binding!!
    private lateinit var shopAdapter: ShopAdapter

    private lateinit var viewModel: ShopViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentShopeBinding.inflate(inflater)
        binding.apply {

            shopAdapter = ShopAdapter{
                val action = ShopFragmentDirections.actionShopFragmentToShopDetailsFragment()
                findNavController().navigate(action)
            }
            shopRv.apply {
                adapter = shopAdapter
                layoutManager = LinearLayoutManager(
                    requireActivity(),
                    LinearLayoutManager.VERTICAL, false
                )
            }
        }
        return binding.root
    }
}