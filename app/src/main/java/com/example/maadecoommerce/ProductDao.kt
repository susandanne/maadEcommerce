package com.example.maadecoommerce

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductDao {
    @GET("/products")
    fun getAllProduct(): Call<List<ProductsItem>>


    @GET("/products/category/{ctg}")
    fun getAllProductByCtg(@Path("ctg") id: String): Call<List<ProductsItem>>
}