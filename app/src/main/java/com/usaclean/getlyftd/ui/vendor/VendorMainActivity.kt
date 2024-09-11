package com.usaclean.getlyftd.ui.vendor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.ActivityDriverMainBinding
import com.usaclean.getlyftd.databinding.ActivityVendorMainBinding

class VendorMainActivity : AppCompatActivity() {

    private var _binding: ActivityVendorMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityVendorMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.fragmentContainer)
        binding.bottomNav.setupWithNavController(navController)
    }
}