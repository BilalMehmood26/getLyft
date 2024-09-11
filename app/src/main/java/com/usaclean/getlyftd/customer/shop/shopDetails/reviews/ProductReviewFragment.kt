package com.usaclean.getlyftd.customer.shop.shopDetails.reviews

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.customer.shop.shopList.ShopAdapter
import com.usaclean.getlyftd.databinding.FragmentProductReviewBinding
import com.usaclean.getlyftd.databinding.FragmentShopeBinding

class ProductReviewFragment : Fragment() {

    companion object {
        fun newInstance() = ProductReviewFragment()
    }

    private lateinit var viewModel: ProductReviewViewModel
    private var _binding: FragmentProductReviewBinding? = null
    private val binding get() = _binding!!
    private lateinit var productReviewAdapter: ProductReviewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductReviewBinding.inflate(inflater)
        binding.apply {

            productReviewAdapter = ProductReviewAdapter{
            }
            productReviewRv.apply {
                adapter = productReviewAdapter
                layoutManager = LinearLayoutManager(
                    requireActivity(),
                    LinearLayoutManager.VERTICAL, false
                )
            }
        }
        return binding.root
    }
}