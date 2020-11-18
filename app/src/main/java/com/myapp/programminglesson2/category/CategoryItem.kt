package com.myapp.programminglesson2.category

import android.graphics.Color
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class CategoryItem : Parcelable {
    var icon:Int? = null
    var title:String = ""
    var background:Int? = null
    var titleColor:Int = Color.parseColor("#ffffff")
}