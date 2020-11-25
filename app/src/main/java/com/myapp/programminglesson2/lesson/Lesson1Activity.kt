package com.myapp.programminglesson2.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
        aLesson1_button.text = "버튼 1!"
        aLesson1_button.setOnClickListener {
            Toast.makeText(this, "버튼1이 클릭됬어요!", Toast.LENGTH_SHORT).show()
            aLesson1_text.text = "버튼1이 클릭됬어요!"
        }

        aLesson1_button2.setOnClickListener {
            val textView = findViewById<TextView>(R.id.aLesson1_text)
            if(textView != null) {
                textView.text = "findViewById로 바꿔봤어요"
            }
            Toast.makeText(this, "버튼2이 클릭됬어요!", Toast.LENGTH_SHORT).show()
        }

        aLesson1_button3.setOnClickListener {
            aLesson1_text.text = "EditText의 값을 변경시켜보세요."
            val value = iLesson1_edit.text.toString()
            Toast.makeText(this, "버튼3이 클릭되었어요! EditText = $value", Toast.LENGTH_SHORT).show()
        }
    }
}