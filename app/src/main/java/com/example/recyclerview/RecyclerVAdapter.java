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

public class RecyclerVAdapter extends RecyclerView.Adapter<RecyclerVAdapter.RViewHolder> {


    Context context;
    List<Students> studentsList;


    public RecyclerVAdapter(Context context, List<Students> studentsList) {
        this.context = context;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public RecyclerVAdapter.RViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false);
        return new RViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVAdapter.RViewHolder holder, int position) {
        holder.name.setText(studentsList.get(position).getName());
        holder.age.setText(studentsList.get(position).getAge());
        //holder.name.setText(students.getName());
        //holder.age.setText(students.getAge());




    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class RViewHolder extends RecyclerView.ViewHolder{
        TextView name, age;


        public RViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameTv);
            age = itemView.findViewById(R.id.ageTv);
        }
    }
}
