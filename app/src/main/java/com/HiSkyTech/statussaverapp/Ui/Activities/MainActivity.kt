package com.HiSkyTech.statussaverapp.Ui.Activities

import TabLayoutAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.HiSkyTech.statussaverapp.Fragments.Download
import com.HiSkyTech.statussaverapp.Fragments.Videos
import com.HiSkyTech.statussaverapp.Fragments.images
import com.HiSkyTech.statussaverapp.R
import com.HiSkyTech.statussaverapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val tabTitles = arrayOf("Images", "Videos", "Downloaded")
    private val tabIcons = intArrayOf(
        com.HiSkyTech.statussaverapp.R.drawable.ic_tab2,
        com.HiSkyTech.statussaverapp.R.drawable.ic_tab3,
        com.HiSkyTech.statussaverapp.R.drawable.ic_tab4
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





        binding.apply {


            /////////////////////////////////// this is the DrawerLayout code////////////////////////////////////////////

            toolBar.setNavigationOnClickListener {
                drawerLayout.open()
            }
            navigationView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    com.HiSkyTech.statussaverapp.R.id.menu_status -> {

                        drawerLayout.close()
                    }

                    com.HiSkyTech.statussaverapp.R.id.menu_business_status -> {

                        drawerLayout.close()
                    }

                    com.HiSkyTech.statussaverapp.R.id.menu_settings -> {

                        drawerLayout.close()
                    }
                }

                return@setNavigationItemSelectedListener true
            }


            /////////////////////////////////////// this is the tablayout code /////////////////////////////////////////
            val tabLayout = binding.tabLayout
            val viewPager = binding.viewPager
            val adapter = TabLayoutAdapter(this@MainActivity)
            viewPager.adapter = adapter

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.setIcon(tabIcons[position])
                tab.text = tabTitles[position]
            }.attach()

// Set up fragment navigation when ViewPager page changes


            viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    val fragment = createFragment(position)
                    navigateToFragment(fragment)
                }
            })

        }
    }
    // Function to create fragment instances
    private fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> images() // Create an instance of ImagesFragment
            1 -> Videos() // Create an instance of VideosFragment
            2 -> Download() // Create an instance of DownloadFragment
            else -> Fragment() // Empty fragment for unknown positions
        }
    }

    // Navigate to the selected fragment
    private fun navigateToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}