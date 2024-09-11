package com.usaclean.getlyftd.ui.driver.driverOrder

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.customer.home.HomeFragmentDirections
import com.usaclean.getlyftd.customer.home.RecommendedProductAdapter
import com.usaclean.getlyftd.databinding.ActivityDriverMainBinding
import com.usaclean.getlyftd.databinding.FragmentDriverOrderBinding
import com.usaclean.getlyftd.databinding.FragmentHomeBinding

class DriverOrderFragment : Fragment() {

    private var _binding: FragmentDriverOrderBinding? = null
    private val binding get() = _binding!!

    private lateinit var newOrderAdapter: NewOrderAdapter
    private lateinit var completedOrderAdapter: CompletedOrderAdapter
    private lateinit var runningOrderAdapter: RunningOrderAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDriverOrderBinding.inflate(inflater)
        binding.apply {

            newOrderAdapter = NewOrderAdapter {

                val action = DriverOrderFragmentDirections.actionDriverOrderFragmentToNewOrderDetailsFragment("newOrder")
                findNavController().navigate(action)
            }
            completedOrderAdapter = CompletedOrderAdapter {
                val action = DriverOrderFragmentDirections.actionDriverOrderFragmentToNewOrderDetailsFragment("completedOrder")
                findNavController().navigate(action)
            }
            runningOrderAdapter = RunningOrderAdapter {
                val action = DriverOrderFragmentDirections.actionDriverOrderFragmentToNewOrderDetailsFragment("runningOrder")
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
}