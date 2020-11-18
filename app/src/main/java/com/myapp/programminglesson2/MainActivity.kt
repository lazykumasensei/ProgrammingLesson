package com.myapp.programminglesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.programminglesson2.category.CategoryPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initLayout()
    }

    private fun initLayout(){
        lCategory_pager.run {
            adapter = CategoryPagerAdapter(this@MainActivity)
        }
    }
}