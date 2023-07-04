package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DFragment extends Fragment {

    public DFragment() {
        // Required empty public constructor
    }


    String[] sem={"first","sec","third","fourth"};




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vw = inflater.inflate(R.layout.fragment_d, container, false);

        RecyclerView recyclerView = vw.findViewById(R.id.recylerSubject);

        recyclerView.setLayoutManager(new LinearLayoutManager((Navigation)getActivity()));

        setContentView(R.layout.activity_main);

       Spinner spinner=vw.findViewById(R.id.spinner);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(container.getContext(), android.R.layout.simple_spinner_item,sem);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        return vw;
    }

    private void setContentView(int activity_main) {
    }
}