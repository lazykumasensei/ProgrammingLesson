package com.myapp.programminglesson2.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.programminglesson2.R
import com.myapp.programminglesson2.category.CategoryPagerAdapter
import kotlinx.android.synthetic.main.activity_finallesson.*

class FinalLessonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finallesson)
        initLayout()
    }

    private fun initLayout(){
        lCategory_pager.run {
            adapter = CategoryPagerAdapter(this@FinalLessonActivity)
        }
    }
}