package com.myapp.programminglesson2.intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myapp.programminglesson2.R
import com.myapp.programminglesson2.lesson.FinalLessonActivity
import com.myapp.programminglesson2.lesson.Lesson1Activity
import com.myapp.programminglesson2.lesson.Lesson2Activity
import kotlinx.android.synthetic.main.activity_intro.*
import kotlinx.android.synthetic.main.i_lesson.view.*
import org.jetbrains.anko.startActivity

class introActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        aIntro_list.run {
            setHasFixedSize(true)
            adapter = LessonAdapter(listOf(
                    "Lesson 1 : Event ( OnClickEvent ) ",
                    "Lesson 2 : RecyclerView and Adapter",
                    "Final Result")).apply {
                onClickItem = {
                    when(it){
                        0 -> {
                            startActivity<Lesson1Activity>()
                        }
                        1 -> {
                            startActivity<Lesson2Activity>()
                        }
                        else->{
                            startActivity<FinalLessonActivity>()
                        }
                    }
                }
            }
        }
    }

    class LessonAdapter(val datas: List<String>) :
            RecyclerView.Adapter<LessonAdapter.LessonViewHolder>(){

        lateinit var onClickItem:(Int) -> Unit
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
                                onClickItem(adapterPosition)
                        }
                    }
                }
            }
        }
    }
}