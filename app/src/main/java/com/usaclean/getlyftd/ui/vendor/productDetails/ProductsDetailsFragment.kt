package com.usaclean.getlyftd.ui.vendor.productDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.usaclean.getlyftd.R

class ProductsDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = ProductsDetailsFragment()
    }

    private lateinit var viewModel: ProductsDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_products_details, container, false)
    }
}