package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


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



        FloatingActionButton btnPhn0 = (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton);
        FloatingActionButton btnPhn1 = (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton3);
        FloatingActionButton btnPhn2 = (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton5);
        FloatingActionButton btnPhn3 = (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton7);
        FloatingActionButton btnPhn4 = (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton9);
        FloatingActionButton btnPhn5 = (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton11);
        FloatingActionButton btnPhn6 = (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton13);


        FloatingActionButton btnemail0= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton2);
        FloatingActionButton btnemail1= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton4);
        FloatingActionButton btnemail2= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton6);
        FloatingActionButton btnemail3= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton8);
        FloatingActionButton btnemail4= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton10);
        FloatingActionButton btnemail5= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton12);
        FloatingActionButton btnemail6= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButton14);


        FloatingActionButton btnWhatsapp0= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButtona);
        FloatingActionButton btnWhatsapp1= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButtonb);
        FloatingActionButton btnWhatsapp2= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButtonc);
        FloatingActionButton btnWhatsapp3= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButtond);
        FloatingActionButton btnWhatsapp4= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButtone);
        FloatingActionButton btnWhatsapp5= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButtonf);
        FloatingActionButton btnWhatsapp6= (FloatingActionButton) inflateIt.findViewById(R.id.floatingActionButtong);



        btnPhn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ((Navigation)getActivity()).dial("9448009306");
            }
        });

        btnPhn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ((Navigation)getActivity()).dial("9844747919");
            }
        });

        btnPhn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ((Navigation)getActivity()).dial("7411780882");
            }
        });

        btnPhn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ((Navigation)getActivity()).dial("9448109123");
            }
        });

        btnPhn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ((Navigation)getActivity()).dial("9880309712");
            }
        });

        btnPhn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ((Navigation)getActivity()).dial("9480794017");
            }
        });
        btnPhn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ((Navigation)getActivity()).dial("9480225785");
            }
        });



        btnemail0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).email("ks_shreedhara@yahoo.com");
            }
        });

        btnemail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).email("mdrafi2km@yahoo.com");
            }
        });

        btnemail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).email("naika2k6@gmail.com");
            }
        });

        btnemail3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).email("bnveerappa@gmail.com");
            }
        });

        btnemail4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).email("shradhapokle02@gmail.com");
            }
        });

        btnemail5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).email("geethanb291979@gmail.com");
            }
        });

        btnemail6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).email("kavig8888@yahoo.com");
            }
        });

        btnWhatsapp0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).whatsapp("9448009306");
            }
        });
        btnWhatsapp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).whatsapp("9448009306");
            }
        });
        btnWhatsapp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).whatsapp("9448009306");
            }
        });
        btnWhatsapp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).whatsapp("9448009306");
            }
        });
        btnWhatsapp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).whatsapp("9448009306");
            }
        });
        btnWhatsapp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).whatsapp("9448009306");
            }
        });

        btnWhatsapp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation)getActivity()).whatsapp("9448009306");
            }
        });
        return inflateIt;
    }
}