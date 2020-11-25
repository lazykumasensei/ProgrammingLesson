package com.myapp.programminglesson2.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.myapp.programminglesson2.R
import kotlinx.android.synthetic.main.activity_lesson1.*
import kotlinx.android.synthetic.main.activity_lesson2.*
import kotlinx.android.synthetic.main.i_lesson.view.*
import kotlinx.android.synthetic.main.i_lesson1.*
import org.jetbrains.anko.startActivity

class Lesson1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1)
        aLesson1_text.text = "hello world!!"
        aLesson1_button.text = "Click!"
        aLesson1_button.setOnClickListener {
            //Toast.makeText(this, "버튼이 클릭됬어요! 신기한 Listener!", Toast.LENGTH_SHORT).show()
            //aLesson1_text.text = "버튼이 클릭됬어요!"
            /*
            val textView = findViewById<TextView>(R.id.aLesson1_text)
            if(textView != null) {
                textView.text = "findViewById로 바꿔봤어요"
            }
            */
            val value = iLesson1_edit.text
            Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
        }
    }
}