package com.ubdtce.csestudent;

import static android.app.PendingIntent.getActivity;

import static com.ubdtce.csestudent.Navigation.dial;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class RecyclerFaculty extends RecyclerView.Adapter<RecyclerFaculty.ViewHolder> {
    Context context;
    ArrayList<FacultyModel> arrFaculty;
    RecyclerFaculty(Context context, ArrayList<FacultyModel> arrFaculty){
        this.context=context;
        this.arrFaculty=arrFaculty;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vw = LayoutInflater.from(context).inflate(R.layout.faculty_row,parent,false);

        ViewHolder viewHolder=new ViewHolder(vw);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(arrFaculty.get(position).name);
        holder.txtDesignation.setText(arrFaculty.get(position).designation);

        holder.btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DekhLo", "onClick: Its working");
                dial();
                Log.d("DekhLo", "onClick: Is it Working Actually");

            }
        });

        holder.llRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.add_update_layout);

                EditText edtName = dialog.findViewById(R.id.edtName);
                EditText edtDesignation = dialog.findViewById(R.id.edtDesignation);
                EditText edtPhone = dialog.findViewById(R.id.edtPhone);
                EditText edtEmail = dialog.findViewById(R.id.edtEmail);
                TextView txtTitle = dialog.findViewById(R.id.txtTitle);

                Button btnAction = dialog.findViewById(R.id.btnAction);
                btnAction.setText("Update");
                txtTitle.setText("Update Faculty Details");

                edtName.setText((arrFaculty.get(position)).name);
                edtDesignation.setText((arrFaculty.get(position)).designation);
                edtPhone.setText((arrFaculty.get(position)).number);
                edtEmail.setText((arrFaculty.get(position)).email);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name=edtName.getText().toString();
                        String desig=edtDesignation.getText().toString();
                        String phone=edtPhone.getText().toString();
                        String email=edtEmail.getText().toString();

                        arrFaculty.set(position, new FacultyModel(name,desig,phone,email));

                        notifyItemChanged(position);


                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        holder.llRow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                AlertDialog.Builder builder=new AlertDialog.Builder(context)
                        .setTitle("Delete Contact")
                        .setMessage("Are you sure you want to Delete?")
                        .setIcon(R.drawable.baseline_delete_24)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                arrFaculty.remove(position);
                                notifyItemRemoved(position);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                builder.show();

                return true;
            }
        });

    }



    @Override
    public int getItemCount() {
        return arrFaculty.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtName,txtDesignation;
        FloatingActionButton btnCall,btnEmail,btnWtsp;
        LinearLayout llRow;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
            txtDesignation=itemView.findViewById(R.id.txtDesignation);
            btnCall=itemView.findViewById(R.id.btnCall);
            btnEmail=itemView.findViewById(R.id.btnEmail);
            btnWtsp=itemView.findViewById(R.id.btnWtsp);
            llRow=itemView.findViewById(R.id.llRow);
        }
    }

}
