package com.HiSkyTech.statussaverapp.Ui.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.HiSkyTech.statussaverapp.databinding.ActivitySplashBinding

class splash : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {

            Handler().postDelayed({
                val intent = Intent(this@splash,MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 5000)
        }

    }
}