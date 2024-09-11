package com.usaclean.getlyftd.ui.vendor.orderDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentNewOrderDetailsBinding
import com.usaclean.getlyftd.databinding.FragmentVendorOrderDetailsBinding
import com.usaclean.getlyftd.ui.driver.newOrder.NewOrderDetailsFragmentArgs

class VendorOrderDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = VendorOrderDetailsFragment()
    }

    private val args : VendorOrderDetailsFragmentArgs by  navArgs()
    private var _binding: FragmentVendorOrderDetailsBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: VendorOrderDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVendorOrderDetailsBinding.inflate(inflater)
        binding.apply {
            when(args.orderType){
                "newOrder" ->{
                    trackBtn.visibility = View.VISIBLE
                    cancelOrderBtn.visibility = View.VISIBLE
                    callDriverBtn.visibility = View.GONE
                    textView33.visibility = View.GONE
                    driverCv.visibility = View.GONE
                    reviewDriverBtn.visibility = View.GONE
                    reviewToCustBtn.visibility = View.GONE
                }
                "completedOrder" ->{
                    trackBtn.visibility = View.GONE
                    cancelOrderBtn.visibility = View.GONE
                    callDriverBtn.visibility = View.GONE
                    reviewDriverBtn.visibility = View.VISIBLE
                    reviewToCustBtn.visibility = View.VISIBLE
                }
                "runningOrder" ->{
                    callDriverBtn.visibility = View.VISIBLE
                    trackBtn.visibility = View.VISIBLE
                    cancelOrderBtn.visibility = View.VISIBLE
                    reviewDriverBtn.visibility = View.GONE
                    reviewToCustBtn.visibility = View.GONE
                }
            }
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
        }
        return binding.root
    }
}