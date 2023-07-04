package com.ubdtce.csestudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class DFragmentNew extends Fragment {

    int count;
    float sum=0;
    String num1,num2,num3,num4,num5,num6,num7,num8;


    public DFragmentNew() {
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

        View inflateIt = inflater.inflate(R.layout.fragment_d_new2, container, false);

        Button btnCalculate = (Button) inflateIt.findViewById(R.id.btnCalculate);
        EditText sem1=(EditText) inflateIt.findViewById(R.id.first);
        EditText sem2=(EditText) inflateIt.findViewById(R.id.sec);
        EditText sem3=(EditText) inflateIt.findViewById(R.id.third);
        EditText sem4=(EditText) inflateIt.findViewById(R.id.fourth);
        EditText sem5=(EditText) inflateIt.findViewById(R.id.fifth);
        EditText sem6=(EditText) inflateIt.findViewById(R.id.sixth);
        EditText sem7=(EditText) inflateIt.findViewById(R.id.seventh);
        EditText sem8=(EditText) inflateIt.findViewById(R.id.eight);

        TextView result=(TextView) inflateIt.findViewById(R.id.result);

        DecimalFormat decimalFormat=new DecimalFormat("##.##");


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText((Navigation)getActivity(), "WORkS", Toast.LENGTH_SHORT).show();
               count=0;












                sum=0;
                num1=sem1.getText().toString();
                num2=sem2.getText().toString();
                num3=sem3.getText().toString();
                num4=sem4.getText().toString();
                num5=sem5.getText().toString();
                num6=sem6.getText().toString();
                num7=sem7.getText().toString();
                num8=sem8.getText().toString();

                if(!(num1.equals(""))){
                    count++;
                    sum+=Float.parseFloat(num1);
                }
                if(!num2.equals("")){
                    count++;
                    sum+=Float.parseFloat(num2);
                }
                if(!num3.equals("")){
                    count++;
                    sum+=Float.parseFloat(num3);

                }
                if(!num4.equals("")){
                    count++;
                    sum+=Float.parseFloat(num4);
                }
                if(!num5.equals("")){
                    count++;
                    sum+=Float.parseFloat(num5);

                }
                if(!num6.equals("")){
                    count++;
                    sum+=Float.parseFloat(num6);

                }
                if(!num7.equals("")){
                    count++;
                    sum+=Float.parseFloat(num7);

                }
                if(!num8.equals("")){
                    count++;
                    sum+=Float.parseFloat(num8);

                }

                if(!(sum==0)) {
                    sum = sum / count;
                    String ans = decimalFormat.format(sum);
                    result.setText(ans);
                }else {
                    result.setText("NaN");
                }


                sem1.setText("");
                sem2.setText("");
                sem3.setText("");
                sem4.setText("");
                sem5.setText("");
                sem6.setText("");
                sem7.setText("");
                sem8.setText("");

            }
        });

        return inflateIt;
    }
}