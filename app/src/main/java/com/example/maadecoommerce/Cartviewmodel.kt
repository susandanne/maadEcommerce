package com.example.maadecoommerce

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Cartviewmodel(application: Application): AndroidViewModel(application) {

    private val repo:CartRepository

    init {
        val db=CartDatabse.getdatabase(application.applicationContext)
        repo=CartRepository(db)
    }
    fun insertCart(cart:Productscart)= CoroutineScope(Dispatchers.IO).launch {
        repo.insertcartt(cart)
    }
        fun updateCart(cart:Productscart)= CoroutineScope(Dispatchers.IO).launch {
            repo.updatecartt(cart)
    }
    fun deleteCart(cart:Productscart)= CoroutineScope(Dispatchers.IO).launch {
        repo.delletecartt(cart)
    }
    fun getallcart()=repo.getlallcartt()
}