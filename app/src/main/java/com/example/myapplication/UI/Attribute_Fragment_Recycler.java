package com.example.myapplication.UI;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.Adapters.AdapterForAttributes;
import com.example.myapplication.Adapters.ItemsOfRecyclerView;
import com.example.myapplication.Adapters.RecyclerInterface;
import com.example.myapplication.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Attribute_Fragment_Recycler extends Fragment {
RecyclerView attribute;
AdapterForAttributes adapterForAttributes;
ArrayList<ItemsOfRecyclerView> arrayList;
    public Attribute_Fragment_Recycler() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_attribute_, container, false);
         attribute=v.findViewById(R.id.attributesRecycler);
        attribute.setLayoutManager(new LinearLayoutManager(getContext()));
        attribute.setHasFixedSize(true);
        fillRecycler();
        return v;
    }


    public void fillRecycler(){
        arrayList=new ArrayList<>();
        arrayList.add(new ItemsOfRecyclerView("الصدق"));
        arrayList.add(new ItemsOfRecyclerView("الأمانه"));
        arrayList.add(new ItemsOfRecyclerView("الكرم"));
        arrayList.add(new ItemsOfRecyclerView("الزهد"));
        arrayList.add(new ItemsOfRecyclerView("الحياء"));
        adapterForAttributes=new AdapterForAttributes(arrayList,  new RecyclerInterface() {
            @Override
            public void onItemClick(ItemsOfRecyclerView item) {
                startActivity(new Intent(getContext(),ContentOfAttribute.class));
            }
        });
        attribute.setAdapter(adapterForAttributes);

    }

}
