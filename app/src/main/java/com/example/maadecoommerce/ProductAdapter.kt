package com.example.maadecoommerce

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter(

    val product:List<ProductsItem>,
    val context: Context,
    val cartaddlstener: cartaddlstener                     )
    : RecyclerView.Adapter<productionviewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productionviewholder {
        val view=LayoutInflater.from(context).inflate(R.layout.item_product,parent,false)
        return productionviewholder(view)
    }

    override fun onBindViewHolder(holder: productionviewholder, position: Int) {
        val productds:ProductsItem=product[position]
        holder.productTitleTextView.text=productds.title
        holder.productCategoryTextView.text=productds.category
        holder.productPriceTextView.text="$"+productds.price
        Glide.with(context).load(productds.image).into(holder.productImageView)
     holder.addToCartButton.setOnClickListener{

         val carte:Productscart= Productscart(
        productds.category,productds.description,productds.id,productds.image,
             productds.price,productds.title
         )
         cartaddlstener.cartadd(carte)
     }

    }

    override fun getItemCount(): Int {
        return product.size
    }



}