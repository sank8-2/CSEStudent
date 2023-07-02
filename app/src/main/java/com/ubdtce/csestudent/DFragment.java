package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DFragment extends Fragment {

    public DFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vw = inflater.inflate(R.layout.fragment_d, container, false);

        RecyclerView recyclerView = vw.findViewById(R.id.recylerSubject);

        recyclerView.setLayoutManager(new LinearLayoutManager((Navigation)getActivity()));
        return vw;
    }
}