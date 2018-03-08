package com.example.android.flightapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Zizoh on 02/03/2018.
 */

public class TripTypeFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[]{"Round Trip", "One Way"};
    private Context context;

    public TripTypeFragmentPagerAdapter(FragmentManager fm, Context context) {
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
            return new RoundTripFragment();
            case 1:
                return new OneWayFragment();
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
