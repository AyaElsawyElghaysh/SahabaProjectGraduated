package com.example.myapplication.Adapters;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.UI.Audio_fragmentchar;
import com.example.myapplication.UI.Char_Attribute_Fragment;

public class CharAdapterTabs extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public CharAdapterTabs(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Audio_fragmentchar  audio_fragmentchar = new Audio_fragmentchar();
                return audio_fragmentchar;
            case 1:
                Char_Attribute_Fragment char_attribute_fragment = new Char_Attribute_Fragment();
                return char_attribute_fragment;

            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}