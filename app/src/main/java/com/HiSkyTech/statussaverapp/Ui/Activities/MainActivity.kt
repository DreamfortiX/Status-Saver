package com.HiSkyTech.statussaverapp.Ui.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.HiSkyTech.statussaverapp.R
import com.HiSkyTech.statussaverapp.databinding.ActivityMainBinding
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            toolBar.setNavigationOnClickListener {
                drawerLayout.open()
            }
            navigationView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_status -> {

                        drawerLayout.close()
                    }

                    R.id.menu_business_status -> {

                        drawerLayout.close()
                    }

                    R.id.menu_settings -> {

                        drawerLayout.close()
                    }
                }

                return@setNavigationItemSelectedListener true
            }


//            Handler().postDelayed({
//                splashLayout.animation.animationView
//                animationView.setAnimation("") // Replace "your-animation.json" with your animation file name
//                animationView.playAnimation()
//
//            },3000)
        }
    }
}