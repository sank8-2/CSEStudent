package com.ubdtce.csestudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


        EditText USN=findViewById(R.id.USN),pass=findViewById(R.id.pass);
        Button btnSignIn=findViewById(R.id.btnSignIn);
        TextView flashTwo=findViewById(R.id.flashTwo);

        flashTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Signin.this,Signup.class);
                startActivity(i);
                finish();
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=getIntent().getExtras();
                String sUsn=b.getString("USN");
                String sPass=b.getString("Pass");

                if(sUsn.toString().equals(USN.getText().toString()) && sPass.toString().equals(pass.getText().toString())){
                        Intent i=new Intent(Signin.this,Navigation.class);
                        startActivity(i);
                        finish();
                }
                else {
                    Toast.makeText(getBaseContext(), "Login Unsuccessfull",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}