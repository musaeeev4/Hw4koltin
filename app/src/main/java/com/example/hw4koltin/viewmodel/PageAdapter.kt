package com.example.hw4koltin.viewmodel

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw4koltin.ui.MainActivity

class PageAdapter(private val fragments:ArrayList<Fragment>,activity: MainActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}

