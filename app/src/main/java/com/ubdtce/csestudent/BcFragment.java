package com.ubdtce.csestudent;

import android.content.ContentValues;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        Button btnChange = (Button) inflateIt.findViewById(R.id.btnChange);

        EditText showpass = (EditText) inflateIt.findViewById(R.id.pass);
        EditText confpass = (EditText) inflateIt.findViewById(R.id.conPass);

        TextView showName = (TextView) inflateIt.findViewById(R.id.name);
        TextView showUsn = (TextView) inflateIt.findViewById(R.id.sUsn);


        String finalUsn = usn;
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = showpass.getText().toString();
                String conpass = confpass.getText().toString();


                ContentValues values=new ContentValues();
                values.put("USN",finalUsn);
                values.put("PASSWORD",pass);

                showpass.setText("");
                confpass.setText("");

                if (pass.equals(conpass)) {
                    ((Navigation) getActivity()).receiveFragment(values);
                    ((Navigation)getActivity()).goToEdit();
                }else
                    Toast.makeText((Navigation)getActivity(), "Passwords do not Match", Toast.LENGTH_SHORT).show();
            }
        });




        showName.setText(name);
        showUsn.setText(usn);

        return inflateIt;
    }

}