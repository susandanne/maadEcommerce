package com.example.maadecoommerce

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.maadecoommerce.databinding.ItemCartBinding

class CartAdapter(
    val context: Context,
    val productList: List<Productscart>,
    val listener: CartListener

): RecyclerView.Adapter<CartViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
  val binding=ItemCartBinding.inflate(LayoutInflater.from(context),parent,false)
      return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val plist=productList[position]
        holder.binding.cartItemName.text=plist.title
        holder.binding.cartItemPrice.text=plist.price.toString()
        holder.binding.cartItemQuantity.text=plist.quantity.toString()
        Glide.with(context).load(plist.image).into(holder.binding.cartItemImage)

        holder.binding.cartItemMinus.setOnClickListener {
         listener.cartMinus(plist)
        }
        holder.binding.cartItemPlus.setOnClickListener {
            listener.cartAdd(plist)
        }
        holder.binding.cartItemDelete.setOnClickListener {
            listener.cartDelete(plist)
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}