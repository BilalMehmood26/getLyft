package com.usaclean.getlyftd.customer.shop.shopDetails.products

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.customer.shop.shopList.ShopAdapter
import com.usaclean.getlyftd.customer.shop.shopList.ShopFragmentDirections
import com.usaclean.getlyftd.databinding.FragmentProductsListBinding
import com.usaclean.getlyftd.databinding.FragmentShopDetailsBinding

class ProductsListFragment : Fragment() {

    companion object {
        fun newInstance() = ProductsListFragment()
    }

    private lateinit var viewModel: ProductsListViewModel
    private var _binding: FragmentProductsListBinding? = null
    private val binding get() = _binding!!

    private lateinit var productListAdapter: ProductListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductsListBinding.inflate(inflater)
        binding.apply {
            productListAdapter = ProductListAdapter{

            }
            productListRv.apply {
                adapter = productListAdapter
                layoutManager = GridLayoutManager(requireContext(),2)
            }
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProductsListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}