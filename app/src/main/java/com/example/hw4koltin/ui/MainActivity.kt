package com.example.hw4koltin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.hw4koltin.databinding.ActivityMainBinding
import com.example.hw4koltin.viewmodel.PageAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments: ArrayList<Fragment> = arrayListOf(
            Fragment1(),
            Fragment2(),
            Fragment3()
        )
        val adapter = PageAdapter(fragments, this)
        binding.viewPager.adapter = adapter

    }

}