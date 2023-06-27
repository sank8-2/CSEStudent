package com.ubdtce.csestudent;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class BaFragment extends Fragment{
    public BaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflateIt = inflater.inflate(R.layout.fragment_ba, container, false);



        TextView textView=(TextView) inflateIt.findViewById(R.id.name);
        textView.setText("Sanketh");
        return inflateIt;
    }

    public void setText(String text){

    }
}