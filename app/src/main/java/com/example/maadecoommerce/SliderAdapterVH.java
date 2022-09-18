package com.example.maadecoommerce;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

    View itemView;
    ImageView imageViewBackground;
    ImageView imageGifContainer;
    TextView textViewDescription;

    public SliderAdapterVH(View itemView) {
       super(itemView);
        imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
        imageGifContainer = itemView.findViewById(R.id.iv_gif_container);
        textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
        this.itemView = itemView;
    }
}
