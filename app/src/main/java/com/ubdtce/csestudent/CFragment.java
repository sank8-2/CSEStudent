package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class CFragment extends Fragment {


    public CFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflateIt = inflater.inflate(R.layout.fragment_c, container, false);
        FloatingActionButton btnPhn= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton);
        FloatingActionButton btnemail= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton2);
        FloatingActionButton btnWhatsapp= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButtona);

        btnPhn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ((Navigation)getActivity()).dial();
            }
        });


        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).email();
            }
        });

        btnWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).whatsapp();
            }
        });
        return inflateIt;
    }
}