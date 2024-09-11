package com.usaclean.getlyftd.ui.driver.profile.editProfile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.usaclean.getlyftd.R

class EditDriverProfileFragment : Fragment() {

    companion object {
        fun newInstance() = EditDriverProfileFragment()
    }

    private lateinit var viewModel: EditDriverProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_edit_driver_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EditDriverProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}