package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CFragmentNew extends Fragment {

    ArrayList<FacultyModel> arrFaculty = new ArrayList<>();

    public CFragmentNew() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vw = inflater.inflate(R.layout.fragment_c_new, container, false);

        RecyclerView recyclerView = vw.findViewById(R.id.recyclerFaculty);

        recyclerView.setLayoutManager(new LinearLayoutManager((Navigation)getActivity()));

        FacultyModel model = new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com");

        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));
        arrFaculty.add(new FacultyModel("Shreedhara","HOD","9800290009","s@gmail.com"));

        RecyclerFaculty adapter = new RecyclerFaculty((Navigation)getActivity(),arrFaculty);
        recyclerView.setAdapter(adapter);

        return vw;
    }
}