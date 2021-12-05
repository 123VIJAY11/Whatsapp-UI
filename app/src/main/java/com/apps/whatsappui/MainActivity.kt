package com.apps.whatsappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //sembunyikan action bar
//        getSupportActionBar()?.hide();

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager2)

        val adapter = FragmentAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter
        viewPager2.setCurrentItem(1, true)
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.setIcon(R.drawable.ic_camera_grey)
                }
                1 -> {
                    tab.text = "CHATS"
                }
                2 -> {
                    tab.text = "STATUS"
                }
                3-> {
                    tab.text = "CALLS"
                }
            }
        }.attach()
    }
}