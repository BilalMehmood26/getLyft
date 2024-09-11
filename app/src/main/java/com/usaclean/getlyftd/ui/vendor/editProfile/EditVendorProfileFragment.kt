package com.usaclean.getlyftd.ui.vendor.editProfile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentEditVendorProfileBinding
import com.usaclean.getlyftd.databinding.FragmentVenderProfileBinding

class EditVendorProfileFragment : Fragment() {

    companion object {
        fun newInstance() = EditVendorProfileFragment()
    }

    private lateinit var viewModel: EditVendorProfileViewModel

    private var _binding: FragmentEditVendorProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEditVendorProfileBinding.inflate(inflater)

        binding.apply {

            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
        }
        return binding.root
    }
}