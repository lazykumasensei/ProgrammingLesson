package com.myapp.programminglesson2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.i_category.view.*
import kotlinx.android.synthetic.main.l_grid.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initLayout()
    }

    fun initLayout(){
        lCategory_pager.run {
            adapter = CategoryAdapter(this@MainActivity)
        }
    }

    class CategoryAdapter(fa: FragmentActivity): FragmentStateAdapter(fa){
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

    class CategoryFragment : Fragment(){
        companion object {
            val KEY_DATA = "KEY_DATA"
            fun newInstance(items: ArrayList<CategoryItem>): CategoryFragment =
                CategoryFragment().apply {
                    arguments = Bundle().apply {
                        putParcelableArrayList(KEY_DATA, items)
                    }
                }
        }

        var items:ArrayList<CategoryItem>? = null

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.l_grid, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            items = arguments?.getParcelableArrayList(KEY_DATA)
            lGrid_grid.run {
                numColumns = 4

                adapter = CategoryAdapter().also {
                    items?.also { items ->
                        it.items.addAll(items)
                    }
                }
            }
        }

        class CategoryAdapter: BaseAdapter(){
            var items = ArrayList<CategoryItem>()

            override fun getCount(): Int = items.size
            override fun getItem(position: Int): Any =  items[position]
            override fun getItemId(position: Int): Long = items[position].hashCode().toLong()

            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val item = getItem(position)
                val holder: CategoryHolder
                val view:View
                if(convertView == null){
                    view = LayoutInflater.from(parent?.context).inflate(R.layout.i_category, null)
                    holder = CategoryHolder().apply{
                        icon = view.iCategory_icon
                        title = view.iCategory_title
                        bg = view.iCategory_bg
                    }
                    view.tag = holder
                }else{
                    holder = convertView.tag as CategoryHolder
                    view = convertView
                }

                holder.update(item as CategoryItem)
                return view

            }

            inner class CategoryHolder {
                lateinit var icon: ImageView
                lateinit var title: TextView
                lateinit var bg: View

                fun update(item: CategoryItem){
                    item.icon?.also {
                        icon.setImageResource(it)
                    }
                    item.background?.also {
                        bg.setBackgroundResource(it)
                    }
                    title.text = item.title
                    title.setTextColor(item.titleColor)
                }
            }
        }
    }

    @Parcelize
    class CategoryItem : Parcelable {
        var icon:Int? = null
        var title:String = ""
        var background:Int? = null
        var titleColor:Int = Color.parseColor("#ffffff")
    }
}