package com.ubdtce.csestudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences preferences = getSharedPreferences("Login",MODE_PRIVATE);
                Boolean check = preferences.getBoolean("flag",false);

                Intent i;
                if(check){
                    i=new Intent(MainActivity.this,Navigation.class);
                }else {
                    i=new Intent(MainActivity.this,Signin.class);
                }
                startActivity(i);
                finish();
            }
        },2000);

    }
}