package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class BcFragment extends Fragment {

    public BcFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflateIt = inflater.inflate(R.layout.fragment_bc, container, false);
        String name=null,usn=null;
        if (getArguments() != null) {
            name = getArguments().getString("name");
            usn = getArguments().getString("usn");
        }

        EditText showpass = (EditText) inflateIt.findViewById(R.id.pass);
        EditText confpass = (EditText) inflateIt.findViewById(R.id.conPass);
        TextView showName = (TextView) inflateIt.findViewById(R.id.name);
        TextView showUsn = (TextView) inflateIt.findViewById(R.id.sUsn);

        String pass = showpass.getText().toString();
        String conpass = confpass.getText().toString();



        showName.setText(name);
        showUsn.setText(usn);

        return inflateIt;
    }
}