package com.example.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var FragmentOne: Fragment
    private lateinit var FragmentSecond: Fragment
    private lateinit var FragmentThird: Fragment
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var viewPager: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.photo1,
            R.drawable.photo2,
            R.drawable.photo3
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter


}
}