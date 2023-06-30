package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

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

        viewPager = (ViewPager) inflateIt.findViewById(R.id.viewPager);
        List<Integer> imageList = new ArrayList<>();

        imageList.add(R.drawable.focs);
        imageList.add(R.drawable.sen);
        imageList.add(R.drawable.sen1);
        imageList.add(R.drawable.clg);
        MyAdapter MyAdapter = new MyAdapter(imageList);
        viewPager.setAdapter(MyAdapter);

        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}