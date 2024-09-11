package com.usaclean.getlyftd.ui.vendor.products

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.customer.home.FilterDialogFragment
import com.usaclean.getlyftd.customer.shop.shopList.ShopAdapter
import com.usaclean.getlyftd.customer.shop.shopList.ShopFragmentDirections
import com.usaclean.getlyftd.databinding.FragmentEditVendorProfileBinding
import com.usaclean.getlyftd.databinding.FragmentShopeBinding
import com.usaclean.getlyftd.databinding.FragmentVenderProfileBinding
import com.usaclean.getlyftd.databinding.FragmentVendorsProductsBinding

class VendorsProductsFragment : Fragment() {

    companion object {
        fun newInstance() = VendorsProductsFragment()
    }

    private var _binding: FragmentVendorsProductsBinding? = null
    private val binding get() = _binding!!

    private lateinit var filterDialog: FilterDialogFragment
    private lateinit var vendorProductsAdapter: VendorProductsAdapter
    private lateinit var viewModel: VendorsProductsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVendorsProductsBinding.inflate(inflater)
        binding.apply {

            filterDialog = FilterDialogFragment()
            vendorProductsAdapter = VendorProductsAdapter {
                val action = VendorsProductsFragmentDirections.actionVendorsProductsFragmentToProductsDetailsFragment()
                findNavController().navigate(action)
            }

            shopRv.apply {
                adapter = vendorProductsAdapter
                layoutManager = LinearLayoutManager(
                    requireActivity(),
                    LinearLayoutManager.VERTICAL, false
                )
            }

            imageView16.setOnClickListener {
                filterDialog.show(childFragmentManager, "")
            }
        }

        return binding.root
    }
}