package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerVAdapter extends RecyclerView.Adapter<RecyclerVAdapter.ViewHolder> {


    Context context;
    List<Students> studentsList;


    public RecyclerVAdapter(Context context, List<Students> studentsList) {
        this.context = context;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public RecyclerVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVAdapter.ViewHolder holder, int position) {

        Students s = studentsList.get(position);
        //String namename = studentsList.get(position).getName();
        //int ageage = studentsList.get(position).getAge();


        //holder.setdata(namename,ageage);

        holder.name.setText(s.getName());
        holder.age.setText(s.getAge());
        //holder.age.setText(students.getAge());




    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name, age;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameTv);
            age = itemView.findViewById(R.id.ageTv);
        }

        public void setdata(String namename, int ageage) {

        }
    }
}
