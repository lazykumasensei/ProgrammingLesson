package com.myapp.programminglesson2.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.myapp.programminglesson2.R
import kotlinx.android.synthetic.main.activity_lesson2.*
import kotlinx.android.synthetic.main.i_lesson.view.*
import org.jetbrains.anko.startActivity

class Lesson2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson2)
        aLesson2_list.run {
            setHasFixedSize(true)
            adapter = MyAdapter(listOf(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10",
                "Item 11",
                "Item 12",
                "Item 13",
                "Item 14",
                "Item 15",
                "Item 16",
                "Item 17",
                "Item 18",
                "Item 19",
            )).apply {
                onClickItem = { data, position ->
                    Toast.makeText(this@Lesson2Activity, data, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    class MyAdapter(val datas: List<String>) :
        RecyclerView.Adapter<MyAdapter.LessonViewHolder>(){

        lateinit var onClickItem:(String, Int) -> Unit
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
            return LessonViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.i_lesson, parent, false))
        }

        override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
            holder.updateUI(datas[position])
        }

        override fun getItemCount(): Int = datas.size

        inner class LessonViewHolder(val parent: View) : RecyclerView.ViewHolder(parent){
            fun updateUI(data:String){
                parent.run {
                    iLessaon_text?.text = data
                    iLessaon_text?.setOnClickListener {
                        if(adapterPosition != RecyclerView.NO_POSITION){
                            if(::onClickItem.isInitialized)
                                onClickItem(data, adapterPosition)
                        }
                    }
                }
            }
        }
    }
}