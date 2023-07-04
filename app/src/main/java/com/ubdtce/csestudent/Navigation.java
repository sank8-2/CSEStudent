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

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class Navigation extends AppCompatActivity {

    DrawerLayout navigationBar;

    Fragment fragmentbb=new BbFragment();
    Fragment fragmentbc=new BcFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        NavigationView navView=findViewById(R.id.navView);

        showHomeFragment();

        View headerView=navView.getHeaderView(0);
        TextView sUsn=(TextView) headerView.findViewById(R.id.sUsn);

        Toolbar toolbar=findViewById(R.id.toolbar);
        TextView sname=(TextView) headerView.findViewById(R.id.name);



        SharedPreferences usn=getSharedPreferences("USN",MODE_PRIVATE);
        String USN = usn.getString("USNID","");

        DBHelper dbHelp=new DBHelper(this);
        ArrayList<StudentModel> arrStudent = dbHelp.fetchLoggedStudent(USN);
        navigationBar=findViewById(R.id.navigationBar);

        sname.setText(arrStudent.get(0).name);
        sUsn.setText(arrStudent.get(0).usn);

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
//                    loadFragment(new DFragment());
                  loadFragment(new DFragmentNew());
                }
                 else{
                    loadFragment(new EFragment());
                }

                 navigationBar.closeDrawer(GravityCompat.START);


                return true;
            }
        });



    }

    private void showHomeFragment() {

        FragmentManager f=getSupportFragmentManager();
        FragmentTransaction ft=f.beginTransaction();
        ft.replace(R.id.container,new AFragment());
        ft.commit();

    }

    @Override
    public void onBackPressed(){

        FragmentManager f=getSupportFragmentManager();
        Fragment fm = f.findFragmentById(R.id.container);

        if(navigationBar.isDrawerOpen(GravityCompat.START)){
            navigationBar.closeDrawer(GravityCompat.START);
        }else if(fm.equals(fragmentbb)){
            loadFragment(new BaFragment());
        }else if(fm.equals(fragmentbc)){
            loadFragment(fragmentbb);
        }else
            super.onBackPressed();
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        SharedPreferences usn=getSharedPreferences("USN",MODE_PRIVATE);
        String USN = usn.getString("USNID","");

        DBHelper dbHelp=new DBHelper(this);
        ArrayList<StudentModel> arrStudent = dbHelp.fetchLoggedStudent(USN);

        Bundle bundle=new Bundle();
        bundle.putString("name",arrStudent.get(0).name);
        bundle.putString("usn",arrStudent.get(0).usn);
        bundle.putString("email",arrStudent.get(0).email);
        bundle.putString("phone",arrStudent.get(0).phone);
        bundle.putString("pass",arrStudent.get(0).pass);

        fragment.setArguments(bundle);

        ft.replace(R.id.container, fragment);
        ft.commit();
    }

    public void goToLogin(View view) {

        SharedPreferences preferences=getSharedPreferences("Login",MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();

        Intent i=new Intent(Navigation.this,Signin.class);
        editor.putBoolean("flag",false);
        editor.apply();
        startActivity(i);
        finish();
    }

    public void receiveFragment(ContentValues contentValues){

        DBHelper dbHelper=new DBHelper(this);

        dbHelper.updateStudent(contentValues);

    }



    public static void dial(){
        Activity activity=new Activity();
        Intent intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:9448009306"));
        activity.startActivity(intent);
    }

    public void email(){
        Intent intent=new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:shradhapokle02@gmail.com"));
        startActivity(intent);
    }

    public void whatsapp(){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=+919448009306"));
        startActivity(intent);
    }

    public void gitHub(){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://github.com/sank8-2/CSEStudent"));
        startActivity(intent);
    }



    public void goToEdit() {
        loadFragment(fragmentbb);
    }

    public void goToChange(View view) {
        loadFragment(fragmentbc);
    }

    public void goToProfile() {
        loadFragment(new BaFragment());
    }

}