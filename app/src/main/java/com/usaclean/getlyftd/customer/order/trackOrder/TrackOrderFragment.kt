package com.usaclean.getlyftd.customer.order.trackOrder

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentPaymentBinding
import com.usaclean.getlyftd.databinding.FragmentTrackOrderBinding
import com.usaclean.getlyftd.ui.dialog.CancelOrderFragment
import com.usaclean.getlyftd.ui.dialog.SuccessDialogFragment

class TrackOrderFragment : Fragment() {

    companion object {
        fun newInstance() = TrackOrderFragment()
    }

    private lateinit var viewModel: TrackOrderViewModel


    private lateinit var cancelOrderFragment : CancelOrderFragment

    private var _binding: FragmentTrackOrderBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTrackOrderBinding.inflate(inflater)

        cancelOrderFragment = CancelOrderFragment()
        binding.apply {
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }

            cancelOrderTv.setOnClickListener {
                cancelOrderFragment.show(childFragmentManager,"")
            }
        }
        return binding.root
    }

}