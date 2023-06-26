package com.ubdtce.csestudent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class Navigation extends AppCompatActivity {

    DrawerLayout navigationBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        navigationBar=findViewById(R.id.navigationBar);
        NavigationView navView=findViewById(R.id.navView);
        Toolbar toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,navigationBar,toolbar,R.string.openDrawer,R.string.closeDrawer);

        navigationBar.addDrawerListener(toggle);
        toggle.syncState();

        loadFragment(new AFragment());


        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id=item.getItemId();
                if(id==R.id.optHome){
                    loadFragment(new AFragment());
                } else if (id==R.id.optProfile) {
                    loadFragment(new BaFragment());
                }
                 else if (id==R.id.optFaculty) {
                    loadFragment(new CFragment());
                }
                 else if (id==R.id.optCgpa) {
                    loadFragment(new DFragment());
                }
                 else{
                    loadFragment(new EFragment());
                }

                 navigationBar.closeDrawer(GravityCompat.START);


                return true;
            }
        });



    }
    @Override
    public void onBackPressed(){
        if(navigationBar.isDrawerOpen(GravityCompat.START)){
            navigationBar.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        ft.add(R.id.container, fragment);
        ft.commit();
    }
}