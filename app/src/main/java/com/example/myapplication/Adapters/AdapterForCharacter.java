package com.example.myapplication.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.myapplication.R;

import java.util.ArrayList;

public class AdapterForCharacter extends RecyclerView.Adapter<AdapterForCharacter.MyViewHolder> {
    ArrayList<ItemsOfRecyclerView> arrayList ;
    RecyclerInterface listenerInterface;


    public AdapterForCharacter(ArrayList<ItemsOfRecyclerView> arrayList, RecyclerInterface recyclerInterface) {
        this.arrayList = arrayList;
        this.listenerInterface=recyclerInterface;
    }

    @NonNull
    @Override

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_raw_charachter, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        holder.nameChar.setText(arrayList.get(position).getNameOfChar());
        holder.namefamous.setText(arrayList.get(position).getFamnousName());

        holder.imfamous.setImageResource(arrayList.get(position).getImageView());

    }

    @Override
    public int getItemCount() {

        return arrayList.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
         TextView nameChar;
        ImageView imfamous;
        TextView namefamous;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            nameChar = itemView.findViewById(R.id.nameOfCharacter);
            imfamous = itemView.findViewById(R.id.image);
            namefamous = itemView.findViewById(R.id.famousname);
          final String nameCh=nameChar.getText().toString();
          final String nameFamous=namefamous.getText().toString();
          final int image=imfamous.getId();
          itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  listenerInterface.onItemClick(new ItemsOfRecyclerView(nameCh,nameFamous,image));
              }
          });

        }
    }
}
