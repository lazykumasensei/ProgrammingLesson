package com.myapp.programminglesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
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
                            title = "1"
                        })
                        add(CategoryItem().apply {
                            title = "1"
                        })
                        add(CategoryItem().apply {
                            title = "1"
                        })
                        add(CategoryItem().apply {
                            title = "1"
                        })
                        add(CategoryItem().apply {
                            title = "1"
                        })
                        add(CategoryItem().apply {
                            title = "1"
                        })
                        add(CategoryItem().apply {
                            title = "1"
                        })
                        add(CategoryItem().apply {
                            title = "1"
                        })
                        add(CategoryItem().apply {
                            title = "1"
                        })
                        add(CategoryItem().apply {
                            title = "1"
                        })
                    }
                    1 -> {
                        add(CategoryItem().apply {
                            title = "2"
                        })
                        add(CategoryItem().apply {
                            title = "2"
                        })
                        add(CategoryItem().apply {
                            title = "2"
                        })
                        add(CategoryItem().apply {
                            title = "2"
                        })
                        add(CategoryItem().apply {
                            title = "2"
                        })
                        add(CategoryItem().apply {
                            title = "2"
                        })
                        add(CategoryItem().apply {
                            title = "2"
                        })
                        add(CategoryItem().apply {
                            title = "2"
                        })
                        add(CategoryItem().apply {
                            title = "2"
                        })
                        add(CategoryItem().apply {
                            title = "2"
                        })
                    }
                    else -> {
                        add(CategoryItem().apply {
                            title = "3"
                        })
                        add(CategoryItem().apply {
                            title = "3"
                        })
                        add(CategoryItem().apply {
                            title = "3"
                        })
                        add(CategoryItem().apply {
                            title = "3"
                        })
                        add(CategoryItem().apply {
                            title = "3"
                        })
                        add(CategoryItem().apply {
                            title = "3"
                        })
                        add(CategoryItem().apply {
                            title = "3"
                        })
                        add(CategoryItem().apply {
                            title = "3"
                        })
                        add(CategoryItem().apply {
                            title = "3"
                        })
                        add(CategoryItem().apply {
                            title = "3"
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
                numColumns = 5
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

                fun update(item: CategoryItem){
                    item.icon?.also {
                        icon.setImageResource(it)
                    }
                    title.text = item.title
                }
            }
        }
    }

    @Parcelize
    class CategoryItem : Parcelable {
        var icon:Int? = null
        var title:String = ""
    }
}