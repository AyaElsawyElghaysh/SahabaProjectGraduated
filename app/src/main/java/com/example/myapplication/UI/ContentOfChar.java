package com.example.myapplication.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.myapplication.Adapters.AttribAdapterTabs;
import com.example.myapplication.Adapters.CharAdapterTabs;
import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;

public class ContentOfChar  extends AppCompatActivity {
        TabLayout tabLayout;
        ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.headphones,
            R.drawable.ic_person,};



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_content_of_char);

            tabLayout=(TabLayout)findViewById(R.id.tabContentchar);
            viewPager=(ViewPager)findViewById(R.id.viewpagerChar);

            tabLayout.addTab(tabLayout.newTab().setText("صوتي"));
            tabLayout.addTab(tabLayout.newTab().setText("صفات الشخصيه"));
            setupTabIcons();
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

            CharAdapterTabs adapter = new CharAdapterTabs(this,getSupportFragmentManager(), tabLayout.getTabCount());
            viewPager.setAdapter(adapter);

            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

        }
    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);


    }
}

