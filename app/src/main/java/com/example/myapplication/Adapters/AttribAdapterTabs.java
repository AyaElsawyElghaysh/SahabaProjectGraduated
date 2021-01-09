package com.example.myapplication.Adapters;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.myapplication.UI.Audio_fragmentattrib;

import com.example.myapplication.UI.Steps_attribute_fragment;
import com.example.myapplication.UI.Whose_char_fragment;

public class AttribAdapterTabs extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public AttribAdapterTabs(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Steps_attribute_fragment steps_attribute_fragment = new Steps_attribute_fragment();
                return steps_attribute_fragment;

            case 1:
                Audio_fragmentattrib audio_fragmentattrib = new Audio_fragmentattrib();
                return audio_fragmentattrib;
            case 2:
                Whose_char_fragment whose_char_fragment = new Whose_char_fragment();
                return whose_char_fragment;

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