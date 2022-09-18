package com.example.maadecoommerce

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CartDaos {
    @Insert
   suspend fun insert(cart:Productscart)
    @Update
    suspend fun update(cart:Productscart)
    @Delete
    suspend fun delete(cart:Productscart)

    @Query("SELECT * FROM cart_items")
    fun getallcart():LiveData<List<Productscart>>
}