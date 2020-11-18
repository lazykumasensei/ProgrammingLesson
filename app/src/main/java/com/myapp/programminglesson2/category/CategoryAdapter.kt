package com.myapp.programminglesson2.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.myapp.programminglesson2.R
import kotlinx.android.synthetic.main.i_category.view.*

class CategoryAdapter: BaseAdapter(){
    var items = ArrayList<CategoryItem>()

    override fun getCount(): Int = items.size
    override fun getItem(position: Int): Any =  items[position]
    override fun getItemId(position: Int): Long = items[position].hashCode().toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val item = getItem(position)
        val holder: CategoryHolder
        val view: View
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