package com.example.maadecoommerce

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CategoryAdapter(
    val listener: ctgListener,
    val categories:List<Category>,
    val context: Context): RecyclerView.Adapter<CategoryViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewholder {
        val view=LayoutInflater.from(context).inflate(R.layout.category_layout,parent,false)
        return CategoryViewholder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewholder, position: Int) {
        val ctg=categories[position]
        holder.catlayouttext.text=ctg.name
        Glide.with(context).load(ctg.imageurl).into(holder.catlayoutimg)
        holder.itemView.setOnClickListener{
            listener.ctgclickListener(ctg)
        }

    }

    override fun getItemCount(): Int {
        return categories.size
    }

}