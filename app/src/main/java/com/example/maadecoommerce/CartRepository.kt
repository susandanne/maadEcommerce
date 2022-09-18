package com.example.maadecoommerce

class CartRepository(private val db:CartDatabse) {

  suspend  fun insertcartt(cart:Productscart)=db.getcartdao().insert(cart)
  suspend  fun updatecartt(cart:Productscart)=db.getcartdao().update(cart)
  suspend  fun delletecartt(cart:Productscart)=db.getcartdao().delete(cart)

    fun getlallcartt()=db.getcartdao().getallcart()


}