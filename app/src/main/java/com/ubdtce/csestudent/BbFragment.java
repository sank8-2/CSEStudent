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
        }

        TextView showName = (TextView) inflateIt.findViewById(R.id.name);
        TextView showUsn = (TextView) inflateIt.findViewById(R.id.sUsn);

        EditText editMail = (EditText) inflateIt.findViewById(R.id.email);
        EditText editPhone = (EditText) inflateIt.findViewById(R.id.phone);

        Button btnSave=(Button) inflateIt.findViewById(R.id.btnSave);

        showName.setText(name);
        showUsn.setText(usn);

        String finalUsn = usn;
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = editMail.getText().toString();
                String phone = editPhone.getText().toString();


                ContentValues values=new ContentValues();
                values.put("USN", finalUsn);
                if(!mail.equals(""))
                    values.put("EMAIL",mail);
                if(!phone.equals(""))
                    values.put("PHONE",phone);

                editPhone.setText("");
                editMail.setText("");

                ((Navigation) getActivity()).receiveFragment(values);
                ((Navigation)getActivity()).goToProfile();

            }
        });

        return inflateIt;
    }
}