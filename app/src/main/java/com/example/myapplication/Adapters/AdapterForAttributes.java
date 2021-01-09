package com.example.myapplication.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class AdapterForAttributes extends RecyclerView.Adapter<AdapterForAttributes.AttributeViewHolder> {
    ArrayList<ItemsOfRecyclerView> arrayListAttribute;
    RecyclerInterface mInterface;

    public AdapterForAttributes(ArrayList<ItemsOfRecyclerView> arrayListAttribute, RecyclerInterface minterface) {
        this.arrayListAttribute = arrayListAttribute;
        this.mInterface = minterface;

    }

    @NonNull
    @Override
    public AttributeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_raw_attribute, parent, false);
        return new AttributeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AttributeViewHolder holder, int position) {
        holder.nameAttribute.setText(arrayListAttribute.get(position).getAttrbuteName());

    }

    @Override
    public int getItemCount() {
        return arrayListAttribute.size();
    }

    public class AttributeViewHolder extends RecyclerView.ViewHolder {
          TextView nameAttribute;
        public AttributeViewHolder(@NonNull View itemView) {
            super(itemView);
            nameAttribute=itemView.findViewById(R.id.nameOfAttribute);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mInterface.onItemClick(new ItemsOfRecyclerView(nameAttribute.getText().toString()));
                }
            });
        }
    }
}

