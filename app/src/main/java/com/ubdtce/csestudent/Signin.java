package com.ubdtce.csestudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Signin extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        DBHelper dbHelp=new DBHelper(this);


        EditText USN=findViewById(R.id.USN),pass=findViewById(R.id.pass);
        Button btnSignIn=findViewById(R.id.btnSignIn);
        TextView flashTwo=findViewById(R.id.flashTwo);


        flashTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Signin.this,Signup.class);
                startActivity(i);
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                StudentModel model=new StudentModel();
                ArrayList<StudentModel> arrStudent = dbHelp.fetchStudent();

                //Bundle b=getIntent().getExtras();
//                String sUsn=b.getString("USN");
//                String sPass=b.getString("Pass");
//                String sUsn=arrStudent.get(0).usn;
//                String sPass=arrStudent.get(0).pass;
                int iter;

                SharedPreferences preferences=getSharedPreferences("Login",MODE_PRIVATE);
                SharedPreferences.Editor editor=preferences.edit();
                for(iter=0;iter<arrStudent.size();iter++){
                if(arrStudent.get(iter).usn.equals(USN.getText().toString()) && arrStudent.get(iter).pass.equals(pass.getText().toString())){
                        Intent i=new Intent(Signin.this,Navigation.class);
                        editor.putBoolean("flag",true);
                        editor.apply();
                        startActivity(i);
                        finish();
                    }
                }
                if(iter>arrStudent.size()){
                    Toast.makeText(getBaseContext(), "Login Unsuccessfull",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}