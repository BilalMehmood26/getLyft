package com.usaclean.getlyftd.ui.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usaclean.getlyftd.R
import com.usaclean.getlyftd.Utilility.postDelayed

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        postDelayed(2000) {
            startActivity(Intent(this@SplashActivity, com.usaclean.getlyftd.ui.onboarding.OnBoardingActivity::class.java))
        }
    }
}