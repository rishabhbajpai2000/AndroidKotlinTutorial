package com.example.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {
    private lateinit var FragmentOne: Fragment
    private lateinit var FragmentSecond: Fragment

    private lateinit var btnFragmentOne: Button
    private lateinit var btnFragmentSecond: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FragmentOne = FragmentOne()
        FragmentSecond = FragmentSecond()
        btnFragmentOne = findViewById(R.id.btnFirstFragment)
        btnFragmentSecond = findViewById(R.id.btnSecondFragment)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFrameLayout, FragmentOne)
            commit()
        }

        btnFragmentOne.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFrameLayout, FragmentOne)
                commit()
            }
        }
        btnFragmentSecond.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFrameLayout, FragmentSecond)
                commit()
            }
        }

    }

}