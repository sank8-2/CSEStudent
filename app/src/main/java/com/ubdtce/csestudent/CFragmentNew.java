/*
package com.ubdtce.csestudent;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CFragmentNew extends Fragment {

    Context thisContext;

    ArrayList<FacultyModel> arrFaculty = new ArrayList<>();
    FloatingActionButton btnAddFaculty;

    public CFragmentNew() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vw = inflater.inflate(R.layout.fragment_c_new, container, false);

        thisContext=container.getContext();

        RecyclerFaculty adapter = new RecyclerFaculty((Navigation)getActivity(),arrFaculty);


        RecyclerView recyclerView = vw.findViewById(R.id.recyclerFaculty);
        btnAddFaculty=vw.findViewById(R.id.btnAddFaculty);
        btnAddFaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.add_update_layout);


                EditText edtName = dialog.findViewById(R.id.edtName);
                EditText edtDesignation = dialog.findViewById(R.id.edtDesignation);
                EditText edtPhone = dialog.findViewById(R.id.edtPhone);
                EditText edtEmail = dialog.findViewById(R.id.edtEmail);

                Button btnAction = dialog.findViewById(R.id.btnAction);

                dialog.show();

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name=edtName.getText().toString();
                        String desig=edtDesignation.getText().toString();
                        String phone=edtPhone.getText().toString();
                        String email=edtEmail.getText().toString();

                        arrFaculty.add(new FacultyModel(name,desig,phone,email));

                        Log.d("Hello", "onClick: Y is it not working");

                        adapter.notifyItemInserted(arrFaculty.size()-1);

                        recyclerView.scrollToPosition(arrFaculty.size()-1);

                        dialog.dismiss();

                    }
                });

            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager((Navigation)getActivity()));

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


        recyclerView.setAdapter(adapter);

        return vw;
    }
}*/
