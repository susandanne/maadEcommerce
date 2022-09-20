package com.example.maadecoommerce

interface CartListener {
    fun cartAdd(cart: Productscart)
    fun cartMinus(cart: Productscart)
    fun cartDelete(cart: Productscart)
}