package com.example.myapplication.UI;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.Adapters.AdapterForCharacter;
import com.example.myapplication.Adapters.ItemsOfRecyclerView;
import com.example.myapplication.Adapters.RecyclerInterface;
import com.example.myapplication.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Charachter_Fragment_Recycler extends Fragment {

 RecyclerView chRecyclerView;
 ArrayList<ItemsOfRecyclerView> arrayList;
    public Charachter_Fragment_Recycler()  {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_charachter_, container, false);
        chRecyclerView=v.findViewById(R.id.charrec);
        chRecyclerView.setHasFixedSize(true);
        chRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
         fillRecycler();
        return v;
    }
    private void fillRecycler()
    {
       arrayList=new ArrayList<>();
        arrayList.add(new ItemsOfRecyclerView("أبو بكر الصديق","الصديق",R.drawable.ic_launcher_background));
        arrayList.add(new ItemsOfRecyclerView("عمر بن الخطاب","الفاروق",R.drawable.ic_launcher_background));
        arrayList.add(new ItemsOfRecyclerView("عثمان بن عفان","ذو النورين",R.drawable.ic_launcher_background));
        arrayList.add(new ItemsOfRecyclerView("علي بن أبي طالب","أول مولود في الأسلام",R.drawable.ic_launcher_background));
        arrayList.add(new ItemsOfRecyclerView("سعيد بن زيد","",R.drawable.ic_launcher_background));
        arrayList.add(new ItemsOfRecyclerView("الزبير بن العوام","حواري رسول الله",R.drawable.ic_launcher_background));
        arrayList.add(new ItemsOfRecyclerView("طلحه بن عبيد الله","طلحه الخير",R.drawable.ic_launcher_background));
        arrayList.add(new ItemsOfRecyclerView("عبدالرحمن بن عوف","",R.drawable.ic_launcher_background));
        arrayList.add(new ItemsOfRecyclerView("سعد بن أبي وقاص","أول من رمي بسهم",R.drawable.ic_launcher_background));
        arrayList.add(new ItemsOfRecyclerView("أبوعبيده بن الجراح","أمين الأمه ",R.drawable.ic_launcher_background));
        final AdapterForCharacter adapter=new AdapterForCharacter(arrayList, new RecyclerInterface() {
            @Override
            public void onItemClick(ItemsOfRecyclerView item) {
              startActivity(new Intent(getContext(),ContentOfChar.class));
            }
        });
        chRecyclerView.setAdapter(adapter);

    }
}
