package com.usaclean.getlyftd.customer.home

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
import com.usaclean.getlyftd.data.ProductModel
import com.usaclean.getlyftd.databinding.FragmentHomeBinding
import com.usaclean.getlyftd.ui.dialog.LoyalityPointsDialogFragment

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val productList : ArrayList<ProductModel> = ArrayList()
    private val categoryList : ArrayList<String> = ArrayList()

    private lateinit var productListAdapter: RecommendedProductAdapter
    private lateinit var categoryAdapter: CategoryAdapter

    private lateinit var filterDialog : FilterDialogFragment

    private lateinit var loyalityPointsDialog : LoyalityPointsDialogFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater)
        binding.apply {
            categoryList.add("CBD")
            categoryList.add("Tobacco")
            categoryList.add("E-cigarettes")
            categoryList.add("CBD")
            categoryList.add("Tobacco")
            categoryList.add("E-cigarettes")
            productList.add(ProductModel(prodName = "Cannabis Oil", prodPrice = "$45", prodRating = "(329 reviews)", prodImg = R.drawable.combodien_oil))
            productList.add(ProductModel(prodName = "Medical Cannabis Oil", prodPrice = "$40", prodRating = "(29 reviews)", prodImg = R.drawable.product_place_holder))
            productList.add(ProductModel(prodName = "Cannabis Oil", prodPrice = "$45", prodRating = "(529 reviews)", prodImg = R.drawable.combodien_oil))
            productList.add(ProductModel(prodName = "Medical Oil", prodPrice = "$400", prodRating = "(290 reviews)", prodImg = R.drawable.product_place_holder))

            productListAdapter = RecommendedProductAdapter(productList) {
                val action = HomeFragmentDirections.actionHomeFragmentToProductDetailsFragment()
                findNavController().navigate(action)
            }

            categoryAdapter = CategoryAdapter(categoryList) {

            }

            categoryRv.apply {
                adapter = categoryAdapter
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            }

            recommendedRv.apply {
                adapter = productListAdapter
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            }

            newProductRv.apply {
                adapter = productListAdapter
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

            }

            filterDialog = FilterDialogFragment()
            loyalityPointsDialog = LoyalityPointsDialogFragment()

            loyalityPointsIv.setOnClickListener {
                loyalityPointsDialog.show(childFragmentManager,"")
            }

            filterIv.setOnClickListener {
                filterDialog.show(childFragmentManager,"")
            }
            return binding.root
        }
    }
}