package com.example.android.flightapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zizoh on 02/03/2018.
 */

public class RoundTripFragment extends Fragment {
    ViewPager mViewPager;
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[]{"Economy", "Business", "First Class"};
    CabinClassFragmentPagerAdapter mCabinClassFragmentPagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.round_trip_fragment, container, false);

        mViewPager = (ViewPager) view.findViewById(R.id.round_trip_cabin_class_viewpager);
        mViewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public int getCount() {
                return PAGE_COUNT;
            }

            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new RoundTripEconomyClassFragment();
                    case 1:
                        return new RoundTripBusinessClassFragment();
                    case 2:
                        return new RoundTripFirstClassFragment();
                    default:
                        return null;
                }
            }

            @Override
            public CharSequence getPageTitle(int position) {
                // Generate title based on item position
                return tabTitles[position];
            }
        });

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.round_trip_cabin_class_tab);
        tabLayout.setupWithViewPager(mViewPager);

        return view;
    }
}