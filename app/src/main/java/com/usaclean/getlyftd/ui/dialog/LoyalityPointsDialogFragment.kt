package com.usaclean.getlyftd.ui.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.FragmentFilterDialogBinding
import com.usaclean.getlyftd.databinding.FragmentLoyalityPointsDialogBinding

class LoyalityPointsDialogFragment : DialogFragment() {

    private var _binding: FragmentLoyalityPointsDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoyalityPointsDialogBinding.inflate(inflater)
        binding.apply {
            backBtn.setOnClickListener {
                dismiss()
            }
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog?.window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT
        )
    }
}