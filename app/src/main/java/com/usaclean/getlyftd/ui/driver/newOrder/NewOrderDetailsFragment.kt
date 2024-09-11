package com.usaclean.getlyftd.ui.driver.newOrder

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentDriverOrderBinding
import com.usaclean.getlyftd.databinding.FragmentNewOrderDetailsBinding
import com.usaclean.getlyftd.ui.onboarding.auth.signup.SignupFragmentArgs
import com.usaclean.getlyftd.ui.onboarding.auth.signup.SignupFragmentDirections

class NewOrderDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = NewOrderDetailsFragment()
    }

    private val args : NewOrderDetailsFragmentArgs by  navArgs()
    private var _binding: FragmentNewOrderDetailsBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: NewOrderDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewOrderDetailsBinding.inflate(inflater)
        binding.apply {
            when(args.orderType){
                "newOrder" ->{
                   materialButton3.visibility = View.VISIBLE
                   trackBtn.visibility = View.VISIBLE
                   materialButton.visibility = View.VISIBLE
                    notesTv.visibility = View.GONE
                    textView52434.visibility = View.GONE
                }
                "completedOrder" ->{
                    materialButton3.visibility = View.GONE
                    trackBtn.visibility = View.GONE
                    materialButton.visibility = View.GONE
                    notesTv.visibility = View.VISIBLE
                    textView52434.visibility = View.VISIBLE
                }
                "runningOrder" ->{
                    materialButton3.visibility = View.GONE
                    trackBtn.visibility = View.GONE
                    materialButton.setText("Reject")
                    materialButton.visibility = View.VISIBLE
                    notesTv.visibility = View.VISIBLE
                    textView52434.visibility = View.VISIBLE
                }
            }
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
        }
        return binding.root
    }
}