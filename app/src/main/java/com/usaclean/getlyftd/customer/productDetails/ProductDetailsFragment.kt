package com.usaclean.getlyftd.customer.productDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentHomeBinding
import com.usaclean.getlyftd.databinding.FragmentProductDetailsBinding

class ProductDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = ProductDetailsFragment()
    }

    private lateinit var viewModel: ProductDetailsViewModel
    private var _binding: FragmentProductDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductDetailsBinding.inflate(inflater)
        binding.apply {
            viewShopTv.setOnClickListener {
                val action = ProductDetailsFragmentDirections.actionProductDetailsFragmentToShopDetailsFragment()
                findNavController().navigate(action)
            }
            backBtn.setOnClickListener {
             findNavController().popBackStack()
            }

            addToCartBtn.setOnClickListener {
                val action = ProductDetailsFragmentDirections.actionProductDetailsFragmentToCartFragment()
                findNavController().navigate(action)
            }
        }
        return binding.root
    }
}