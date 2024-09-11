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
import com.usaclean.getlyftd.databinding.FragmentLoyalityPointsDialogBinding
import com.usaclean.getlyftd.databinding.FragmentSuccessDialogBinding

class SuccessDialogFragment(val onContinue : () -> Unit) : DialogFragment() {

    private var _binding: FragmentSuccessDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSuccessDialogBinding.inflate(inflater)
        binding.apply {

            continueBtn.setOnClickListener {
                onContinue.invoke()
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