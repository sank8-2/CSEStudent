package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BbFragment extends Fragment {

    public BbFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflateIt = inflater.inflate(R.layout.fragment_bb, container, false);

        String name=null,usn=null;
        if (getArguments() != null) {
            name = getArguments().getString("name");
            usn = getArguments().getString("usn");
//            email = getArguments().getString("email");
//            phone = getArguments().getString("phone");
            //pass = getArguments().getString("pass");
        }

        TextView showName = (TextView) inflateIt.findViewById(R.id.name);
        TextView showUsn = (TextView) inflateIt.findViewById(R.id.sUsn);
        showName.setText(name);
        showUsn.setText(usn);

        return inflateIt;
    }
}