package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BaFragment extends Fragment{
    public BaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View inflateIt = inflater.inflate(R.layout.fragment_ba, container, false);

        Button btnChange = (Button) inflateIt.findViewById(R.id.btnChange);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).goToEdit();
            }
        });

        String name=null,usn=null,email=null,phone=null;
        if (getArguments() != null) {
            name = getArguments().getString("name");
            usn = getArguments().getString("usn");
            email = getArguments().getString("email");
            phone = getArguments().getString("phone");
        }

        TextView showName = (TextView) inflateIt.findViewById(R.id.name);
        TextView showUsn = (TextView) inflateIt.findViewById(R.id.sUsn);
        TextView showEmail = (TextView) inflateIt.findViewById(R.id.email);
        TextView showPhone = (TextView) inflateIt.findViewById(R.id.phone);
        showName.setText(name);
        showUsn.setText(usn);
        showEmail.setText(email);
        showPhone.setText(phone);

        return inflateIt;
    }
}