package com.ubdtce.csestudent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
    }

    @Override
    public int getItemCount() {
        return arrFaculty.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtName,txtDesignation;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
            txtDesignation=itemView.findViewById(R.id.txtDesignation);
        }
    }

}
