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
import com.usaclean.getlyftd.databinding.FragmentCancelOrderBinding
import com.usaclean.getlyftd.databinding.FragmentSuccessDialogBinding

class CancelOrderFragment : DialogFragment() {

    private var _binding: FragmentCancelOrderBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCancelOrderBinding.inflate(inflater)
        binding.apply {

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