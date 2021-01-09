package com.example.myapplication.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.example.myapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
CurvedBottomNavigationView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv=findViewById(R.id.bottomNav);
        cv.inflateMenu(R.menu.item_curved);
        cv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.sound :
                        FragmentManager fm=getSupportFragmentManager();
                        fm.beginTransaction().add(R.id.containerFragment,new Charachter_Fragment_Recycler())
                      .commit(); // Toast.makeText(MainActivity.this, "sound", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.attributes:
                        FragmentManager f=getSupportFragmentManager();
                        f.beginTransaction().replace(R.id.containerFragment,new Attribute_Fragment_Recycler())
                                .commit();

                }

                return false;
            }
        });

    }
    public void showPopup() {
       View v=findViewById(R.id.attributes);
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.attributes, popup.getMenu());
        popup.show();
    }
}
