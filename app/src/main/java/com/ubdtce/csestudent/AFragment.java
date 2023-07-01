package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class AFragment extends Fragment {


    ViewPager viewPager;
    public AFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflateIt = inflater.inflate(R.layout.fragment_a, container, false);
        ImageSlider imageSlider=(ImageSlider) inflateIt.findViewById(R.id.image_slider);


        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.clg,"college", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.img,"college", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.img1,"college", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.sen,"college", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.sen1,"college", ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(slideModels);

        return inflateIt;
    }
}