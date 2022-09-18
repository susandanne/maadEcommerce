package com.example.maadecoommerce

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    val catlayoutimg:ImageView = itemView.findViewById(R.id.catlayoutimg)
    val catlayouttext:TextView = itemView.findViewById(R.id.catlayouttext)
}