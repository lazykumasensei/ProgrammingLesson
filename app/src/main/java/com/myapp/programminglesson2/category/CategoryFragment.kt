package com.myapp.programminglesson2.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.myapp.programminglesson2.R
import kotlinx.android.synthetic.main.l_grid.*

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


}