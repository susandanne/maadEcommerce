package com.example.maadecoommerce

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class productionviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

  val  productImageView=itemView.findViewById<ImageView>(R.id.productImageView)
  val  favoriteImageView=itemView.findViewById<ImageView>(R.id.favoriteImageView)
  val  productTitleTextView=itemView.findViewById<TextView>(R.id.productTitleTextView)
  val  productCategoryTextView=itemView.findViewById<TextView>(R.id.productCategoryTextView)
  val  productPriceTextView=itemView.findViewById<TextView>(R.id.productPriceTextView)
  val  addToCartButton=itemView.findViewById<Button>(R.id.addToCartButton)


}