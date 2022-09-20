package com.example.maadecoommerce

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cart_items")
data class Productscart(
    @ColumnInfo
    val category: String,
    @ColumnInfo
    val description: String,


    val id: Int,
    @ColumnInfo
    val image: String,
    @ColumnInfo
    val price: Double,
    @ColumnInfo
    val title: String,
    @ColumnInfo
    val quantity:Int

){  @PrimaryKey(autoGenerate = false)
  var pid=id
}





