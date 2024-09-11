package com.usaclean.getlyftd.ui.vendor.order

import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentDriverOrderBinding
import com.usaclean.getlyftd.databinding.FragmentVendorOrderBinding
import com.usaclean.getlyftd.ui.driver.driverOrder.CompletedOrderAdapter
import com.usaclean.getlyftd.ui.driver.driverOrder.DriverOrderFragmentDirections
import com.usaclean.getlyftd.ui.driver.driverOrder.NewOrderAdapter
import com.usaclean.getlyftd.ui.driver.driverOrder.RunningOrderAdapter

class VendorOrderFragment : Fragment() {

    companion object {
        fun newInstance() = VendorOrderFragment()
    }

    private var _binding: FragmentVendorOrderBinding? = null
    private val binding get() = _binding!!

    private lateinit var newOrderAdapter: NewOrderVendorAdapter
    private lateinit var completedOrderAdapter: VendorCompleteORderAdapter
    private lateinit var runningOrderAdapter: VendorRunningOrderAdapter
    private lateinit var viewModel: VendorOrderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVendorOrderBinding.inflate(inflater)
        binding.apply {

            newOrderAdapter = NewOrderVendorAdapter {

                val action = VendorOrderFragmentDirections.actionVendorOrderFragmentToVendorOrderDetailsFragment("newOrder")
                findNavController().navigate(action)
            }
            completedOrderAdapter = VendorCompleteORderAdapter {
                val action =VendorOrderFragmentDirections.actionVendorOrderFragmentToVendorOrderDetailsFragment("completedOrder")
                findNavController().navigate(action)
            }
            runningOrderAdapter = VendorRunningOrderAdapter {
                val action =VendorOrderFragmentDirections.actionVendorOrderFragmentToVendorOrderDetailsFragment("runningOrder")
                findNavController().navigate(action)
            }

            runningOrderRv.apply {
                adapter = runningOrderAdapter
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            }
            newOrderRv.apply {
                adapter = newOrderAdapter
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            }
            completeOrderRv.apply {
                adapter = completedOrderAdapter
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            }

            newBtn.setOnClickListener {
                newOrderRv.visibility = View.VISIBLE
                completeOrderRv.visibility = View.GONE
                runningOrderRv.visibility = View.GONE
                newBtn.setTextColor(Color.parseColor("#72A565"))
                runningBtn.setTextColor(Color.parseColor("#7A7F7E"))
                completedBtn.setTextColor(Color.parseColor("#7A7F7E"))
                completedBtn.setStrokeColorResource(R.color.grey)
                runningBtn.setStrokeColorResource(R.color.grey)
                newBtn.setStrokeColorResource(R.color.main_green)
            }

            runningBtn.setOnClickListener {
                newOrderRv.visibility = View.GONE
                completeOrderRv.visibility = View.GONE
                runningOrderRv.visibility = View.VISIBLE
                newBtn.setTextColor(Color.parseColor("#7A7F7E"))
                runningBtn.setTextColor(Color.parseColor("#72A565"))
                completedBtn.setTextColor(Color.parseColor("#7A7F7E"))
                completedBtn.setStrokeColorResource(R.color.grey)
                runningBtn.setStrokeColorResource(R.color.main_green)
                newBtn.setStrokeColorResource(R.color.grey)
            }

            completedBtn.setOnClickListener {
                newOrderRv.visibility = View.GONE
                completeOrderRv.visibility = View.VISIBLE
                runningOrderRv.visibility = View.GONE
                newBtn.setTextColor(Color.parseColor("#7A7F7E"))
                runningBtn.setTextColor(Color.parseColor("#7A7F7E"))
                completedBtn.setTextColor(Color.parseColor("#72A565"))
                completedBtn.setStrokeColorResource(R.color.main_green)
                runningBtn.setStrokeColorResource(R.color.grey)
                newBtn.setStrokeColorResource(R.color.grey)
            }
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VendorOrderViewModel::class.java)
        // TODO: Use the ViewModel
    }

}