package com.usaclean.getlyftd.ui.dialog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentUseLoyalityPointsBinding

class UseLoyalityPointsFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentUseLoyalityPointsBinding? = null
    private val binding get() = _binding!!

    override fun getTheme() = R.style.DialogBox

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUseLoyalityPointsBinding.inflate(inflater)
        binding.apply {

        }
        return binding.root
    }

}