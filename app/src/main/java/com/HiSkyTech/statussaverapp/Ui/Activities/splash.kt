package com.HiSkyTech.statussaverapp.Ui.Activities

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
                 animationView = splashLayout.animationView
                 animationView.setAnimation("loding.json") // Replace "your-animation.json" with your animation file name
                 animationView.playAnimation()
             },3000)
        }

    }
}