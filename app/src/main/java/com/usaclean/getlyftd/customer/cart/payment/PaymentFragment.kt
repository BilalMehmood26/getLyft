package com.usaclean.getlyftd.customer.cart.payment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentPaymentBinding
import com.usaclean.getlyftd.ui.dialog.SuccessDialogFragment

class PaymentFragment : Fragment() {

    companion object {
        fun newInstance() = PaymentFragment()
    }

    private lateinit var successDialogFragment : SuccessDialogFragment

    private var _binding: FragmentPaymentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: PaymentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPaymentBinding.inflate(inflater)

        successDialogFragment = SuccessDialogFragment{
            findNavController().navigate(R.id.homeFragment)
        }
        binding.apply {
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }

            continueBtn.setOnClickListener {
                successDialogFragment.show(childFragmentManager,"")
            }
        }
        return binding.root
    }
}