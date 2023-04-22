package com.hrisheekesh.animation;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LanguageRecyclerAdapter extends RecyclerView.Adapter<LanguageRecyclerAdapter.MyViewHolder> {

    Context context;
    ArrayList<MyLang> list;

    public LanguageRecyclerAdapter(Context context, ArrayList<MyLang> list){
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public LanguageRecyclerAdapter.MyViewHolder  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_language_single_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageRecyclerAdapter.MyViewHolder holder, int position) {

        MyLang myLang = list.get(position);
        holder.textView.setText(myLang.language);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

        public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
