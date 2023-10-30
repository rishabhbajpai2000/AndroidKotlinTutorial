package com.example.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var FragmentOne: Fragment
    private lateinit var FragmentSecond: Fragment
    private lateinit var FragmentThird: Fragment
    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FragmentOne = FragmentOne()
        FragmentSecond = FragmentSecond()
        FragmentThird = FragmentThird()
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        setCurrentFragment(FragmentOne)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miHome -> setCurrentFragment(FragmentOne)
                R.id.miChat -> setCurrentFragment(FragmentSecond)
                R.id.miProfile -> setCurrentFragment(FragmentThird)

            }
            true
        }
    }
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }

}