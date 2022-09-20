package com.example.maadecoommerce

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.maadecoommerce.databinding.FragmentCartBinding
import kotlinx.coroutines.NonDisposableHandle.parent


class CartFragment : Fragment(),CartListener {

    lateinit var binding:FragmentCartBinding
    lateinit var cartViewModel:Cartviewmodel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding=FragmentCartBinding.inflate(inflater,container,false)

        cartViewModel=ViewModelProvider(this)[Cartviewmodel::class.java]
        cartViewModel.getallcart().observe(viewLifecycleOwner){
            val adapter:CartAdapter= CartAdapter(requireActivity(),it,this)
             binding.cartrcview.adapter=adapter

        }
        // Inflate the layout for this fragment


        return binding.root
    }

    override fun cartAdd(cart: Productscart) {
        TODO("Not yet implemented")
    }

    override fun cartMinus(cart: Productscart) {
        TODO("Not yet implemented")
    }

    override fun cartDelete(cart: Productscart) {
        TODO("Not yet implemented")
    }


}
