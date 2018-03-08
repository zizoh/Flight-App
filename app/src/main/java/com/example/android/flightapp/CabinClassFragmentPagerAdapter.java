package com.example.android.flightapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Zizoh on 02/03/2018.
 */

public class CabinClassFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[]{"Economy", "Business", "First Class"};
    private Context context;

    public CabinClassFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
            return new OneWayEconomyClassFragment();
            case 1:
                return new OneWayBusinessClassFragment();
            case 2:
            return new OneWayFirstClassFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
    // Generate title based on item position
        return tabTitles[position];
    }
}
