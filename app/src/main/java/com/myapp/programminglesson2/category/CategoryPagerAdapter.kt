package com.myapp.programminglesson2.category

import android.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.myapp.programminglesson2.R

class CategoryPagerAdapter(fa: FragmentActivity): FragmentStateAdapter(fa){
    override fun getItemCount(): Int = 3
    override fun createFragment(position: Int): Fragment {
        return CategoryFragment.newInstance(ArrayList<CategoryItem>().apply {
            when(position){
                0 -> {
                    add(CategoryItem().apply {
                        icon = R.drawable.ic_event
                        title = "Event"
                        background = R.drawable.bg_category_item
                    })
                    add(CategoryItem().apply {
                        icon = R.drawable.ic_ticket
                        title = "SmartTicket"
                        background = R.drawable.bg_category_item
                    })
                    add(CategoryItem().apply {
                        icon = R.drawable.ic_job
                        title = "Jobs"
                        background = R.drawable.bg_category_item
                    })
                    add(CategoryItem().apply {
                        icon = R.drawable.ic_housing
                        title = "Housing"
                        background = R.drawable.bg_category_item
                    })
                    add(CategoryItem().apply {
                        icon = R.drawable.ic_buysell
                        title = "Buy & Sell"
                        background = R.drawable.bg_category_item
                    })
                    add(CategoryItem().apply {
                        icon = R.drawable.ic_article
                        title = "Articles"
                        background = R.drawable.bg_category_item
                    })
                    add(CategoryItem().apply {
                        icon = R.drawable.ic_collection
                        title = "Collections"
                        background = R.drawable.bg_category_item
                    })
                    add(CategoryItem().apply {
                        icon = R.drawable.ic_emergency
                        title = "Emergencies"
                        background = R.drawable.bg_category_item
                    })
                }
                1 -> {
                    add(CategoryItem().apply {
                        title = "NearBy"
                        icon = R.drawable.ic_nearby
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Newest"
                        icon = R.drawable.ic_newest
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Restaurants"
                        icon = R.drawable.ic_restaurants
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Bars & Clubs"
                        icon = R.drawable.ic_bars_clubs
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Services"
                        icon = R.drawable.ic_bars_clubs
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Community"
                        icon = R.drawable.ic_restaurants
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Health"
                        icon = R.drawable.ic_newest
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Education"
                        icon = R.drawable.ic_nearby
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                }
                else -> {
                    add(CategoryItem().apply {
                        title = "Business"
                        icon = R.drawable.ic_nearby
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Sports"
                        icon = R.drawable.ic_newest
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Hotels"
                        icon = R.drawable.ic_restaurants
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Shopping"
                        icon = R.drawable.ic_bars_clubs
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Travel"
                        icon = R.drawable.ic_bars_clubs
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Leisure"
                        icon = R.drawable.ic_restaurants
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Creative"
                        icon = R.drawable.ic_newest
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                    add(CategoryItem().apply {
                        title = "Beauty"
                        icon = R.drawable.ic_nearby
                        background = R.drawable.bg_category_item2
                        titleColor = Color.parseColor("#000000")
                    })
                }
            }
        })
    }
}