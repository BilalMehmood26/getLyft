package com.usaclean.getlyftd.customer.profile.contactus

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentAccountBinding
import com.usaclean.getlyftd.databinding.FragmentContactUsBinding

class ContactUsFragment : Fragment() {

    companion object {
        fun newInstance() = ContactUsFragment()
    }

    private var _binding: FragmentContactUsBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: ContactUsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContactUsBinding.inflate(inflater)
        binding.apply {
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ContactUsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}