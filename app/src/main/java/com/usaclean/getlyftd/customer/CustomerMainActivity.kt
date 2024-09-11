package com.usaclean.getlyftd.customer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.databinding.ActivityCustomerMainBinding

class CustomerMainActivity : AppCompatActivity() {

    private var _binding: ActivityCustomerMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCustomerMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val navController = findNavController(R.id.fragmentContainer)
            bottomNav.setupWithNavController(navController)
            navController.addOnDestinationChangedListener { _, destination, _ ->
                when (destination.id) {
                    R.id.homeFragment -> {
                        bottomNav.visibility = View.VISIBLE
                    }
                    R.id.shopFragment -> {
                        bottomNav.visibility = View.VISIBLE
                    }
                    R.id.cartFragment -> {
                        bottomNav.visibility = View.VISIBLE
                    }
                    R.id.orderFragment -> {
                        bottomNav.visibility = View.VISIBLE
                    }
                    R.id.accountFragment -> {
                        bottomNav.visibility = View.VISIBLE
                    }
                    else -> {
                        bottomNav.visibility = View.GONE
                    }
                }
            }
        }
    }
}