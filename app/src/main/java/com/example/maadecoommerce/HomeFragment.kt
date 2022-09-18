package com.example.maadecoommerce

import android.content.Intent
import android.os.Bundle
import android.util.Log.i
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import com.example.maadecoommerce.databinding.FragmentHomeBinding



class HomeFragment : Fragment(),ctgListener {

         lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate thef layout for this fragment

        binding= FragmentHomeBinding.inflate(inflater,container,false)
        val view=binding.root


        val adapter :CategoryAdapter =CategoryAdapter(this,common.getCategory,requireActivity())

          binding.homeRcview.adapter=adapter
        setupSlider()
        return view
    }

    override fun ctgclickListener(category: Category) {
        val intent:Intent=Intent(requireActivity(),productActivity2::class.java)
        intent.putExtra("name",category.name)
        startActivity(intent)
    }
    private fun setupSlider() {
        val sliderList = listOf<SliderItem>(
            SliderItem(
                "publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without",
                "https://i.pinimg.com/originals/c7/28/58/c72858992482c70d5ec3a585eec352ed.png"
            ),
            SliderItem(
                "publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without",
                "https://i.pinimg.com/originals/88/e1/f9/88e1f93024ce28f5e66f279ddeb0c6ce.png"
            ),
            SliderItem(
                "publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without",
                "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/7bad8c93546277.5f48a570f12f8.jpg"
            ),
            SliderItem(
                "publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without",
                "https://slidebazaar.com/wp-content/uploads/2021/09/product-banner.jpg"
            ),
        )


        val adapter: SliderAdapter = SliderAdapter(requireActivity(), sliderList)
        binding.banner.setSliderAdapter(adapter)


    }


}