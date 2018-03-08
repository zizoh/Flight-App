package com.example.android.flightapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.trip_type_viewpager);
        viewPager.setAdapter(new TripTypeFragmentPagerAdapter(getSupportFragmentManager(),
                MainActivity.this));

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.trip_type_tab);
        tabLayout.setupWithViewPager(viewPager);
    }
}
