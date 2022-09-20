package com.example.maadecoommerce

import android.annotation.SuppressLint
import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.maadecoommerce.databinding.ActivityMainBinding
import com.example.maadecoommerce.databinding.ActivityProduct2Binding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class productActivity2 : AppCompatActivity(),cartaddlstener {
     lateinit var viewModel:Cartviewmodel

     var ctgname:String?=null
    lateinit var productsItem: List<ProductsItem>
    lateinit var binding:ActivityProduct2Binding

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProduct2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val toolbar2=findViewById<Toolbar>(R.id.toolbar2)
        setSupportActionBar(toolbar2)

     viewModel=ViewModelProvider(this)[Cartviewmodel::class.java]



        ctgname=intent.getStringExtra("name")
       var  texttsoolbar=findViewById<TextView>(R.id.texttoolbar)
        texttsoolbar.text=ctgname

         getAllProductFromServer(ctgname!!)

        val actionBar: androidx.appcompat.app.ActionBar? =supportActionBar

            actionBar?.setDisplayHomeAsUpEnabled(true)



    }

    private fun getAllProductFromServer(ctg:String) {

        val getItems: Call<List<ProductsItem>> = MyRetrofit.getRetrofit().getAllProductByCtg(ctg)


        getItems.enqueue(object : Callback<List<ProductsItem>> {
            override fun onResponse(
                call: Call<List<ProductsItem>>,
                response: Response<List<ProductsItem>>
            ) {

                productsItem = response.body()!!
             Log.i("TAG","${productsItem[0]}")

               setupRecyclerView()

            }

            override fun onFailure(call: Call<List<ProductsItem>>, t: Throwable) {
                Log.i("TAG", "onFailure: ${t.localizedMessage}")
            }


        })


    }

    private fun setupRecyclerView() {
        val Adapter:ProductAdapter= ProductAdapter(productsItem,baseContext,this)
        binding.productrecyclerview.adapter=Adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId== android.R.id.home){
           finish()
            return true

        }
        return super.onOptionsItemSelected(item)
    }

    override fun cartadd(cart: Productscart) {
        viewModel.insertCart(cart)
        Toast.makeText(this,"added cart",Toast.LENGTH_LONG).show()
    }

}
