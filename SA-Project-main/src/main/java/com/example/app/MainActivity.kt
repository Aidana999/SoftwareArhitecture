package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    //    var mtabLayout: TabLayout? = null
//    var mViewPager: ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mViewPager: ViewPager = findViewById(R.id.pager)
        setupViewPager(mViewPager)
        var mtabLayout: TabLayout = findViewById(R.id.tabs)
        mtabLayout.setupWithViewPager(mViewPager)

    }

    private fun setupViewPager(viewPager: ViewPager?) {
        val adapter = MyAdapter(this, supportFragmentManager)
        adapter.addFramgent(AttractionsFragment(), "Attractions")
        adapter.addFramgent(ParksFragment(), "Parks")
        adapter.addFramgent(RestaurantsFragment(), "Restaurants")
        viewPager!!.adapter = adapter
    }
}