package com.usaclean.getlyftd.ui.driver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.ActivityCustomerMainBinding
import com.usaclean.getlyftd.databinding.ActivityDriverMainBinding

class DriverMainActivity : AppCompatActivity() {

    private var _binding: ActivityDriverMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDriverMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.fragmentContainer)
       binding.bottomNav.setupWithNavController(navController)
    }
}