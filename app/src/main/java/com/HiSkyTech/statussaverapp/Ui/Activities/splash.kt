package com.HiSkyTech.statussaverapp.Ui.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.HiSkyTech.statussaverapp.R
import com.HiSkyTech.statussaverapp.databinding.ActivitySplashBinding
import com.airbnb.lottie.LottieAnimationView

class splash : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    private lateinit var animationView: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {

            Handler().postDelayed({
                // Start the MainActivity after the delay
                val intent = Intent(this@splash,MainActivity::class.java)
                startActivity(intent)
                finish() // Close the SplashActivity so the user can't go back to it
            }, 9000)
        }

    }
}