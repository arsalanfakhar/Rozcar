package com.trulyfuture.rozcar.screens.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.trulyfuture.rozcar.R
import com.trulyfuture.rozcar.screens.onboarding.OnboardingActivity

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIMEOUT:Long=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,OnboardingActivity::class.java))
        },SPLASH_TIMEOUT)

    }
}