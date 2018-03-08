package com.example.android.flightapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zizoh on 02/03/2018.
 */

public class OneWayBusinessClassFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.one_way_class_type_fragment, container, false);
        return view;
    }
}
