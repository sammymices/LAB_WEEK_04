package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

// Public so CafeFragment can read the titles for the tabs
val TABS_FIXED = listOf(
    R.string.starbucks_title to R.string.starbucks_desc,
    R.string.janjijiwa_title to R.string.janjijiwa_desc,
    R.string.kopikenangan_title to R.string.kopikenangan_desc
)

class CafeAdapter(private val parentFragment: Fragment) : FragmentStateAdapter(parentFragment) {

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        val (_, descRes) = TABS_FIXED[position]
        val content = parentFragment.getString(descRes)
        return CafeDetailFragment.newInstance(content)
    }
}
