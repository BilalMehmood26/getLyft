package com.usaclean.getlyftd.customer.cart.addToCart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.usaclean.getlyftd.customer.shop.shopList.ShopAdapter
import com.usaclean.getlyftd.customer.shop.shopList.ShopFragmentDirections
import com.usaclean.getlyftd.databinding.FragmentCartBinding
import com.usaclean.getlyftd.ui.dialog.UseLoyalityPointsFragment

class CartFragment : Fragment() {

    companion object {
        fun newInstance() = CartFragment()
    }

    private lateinit var viewModel: CartViewModel

    private lateinit var addToCartAdapter: AddToCartAdapter
    private lateinit var useLoyalityPointsDialog: UseLoyalityPointsFragment

    private var _binding: FragmentCartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCartBinding.inflate(inflater)
        binding.apply {

            continueBtn.setOnClickListener {
                val action = CartFragmentDirections.actionCartFragmentToCartAddressFragment()
                findNavController().navigate(action)
            }

            useLoyalityPointsDialog = UseLoyalityPointsFragment()

            submitBtn.setOnClickListener {
                useLoyalityPointsDialog.show(childFragmentManager,"")
            }
            addToCartAdapter = AddToCartAdapter{

            }
            cartRv.apply {
                adapter = addToCartAdapter
                layoutManager = LinearLayoutManager(
                    requireActivity(),
                    LinearLayoutManager.VERTICAL, false
                )
            }

        }
        return binding.root
    }
}