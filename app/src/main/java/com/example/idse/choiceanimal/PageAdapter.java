package com.example.idse.choiceanimal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Loïc on 07/02/2016.
 */
public class PageAdapter extends FragmentStatePagerAdapter {

    private String[] titles = {"Selection", "Vue"};
    private Tab1 tab1;
    private Tab2 tab2;

    public PageAdapter(FragmentManager fm) {
        super(fm);
        tab1=new Tab1();
        tab2=new Tab2();
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return tab1;
            case 1:
                return tab2;
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}