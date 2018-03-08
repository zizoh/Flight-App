package com.example.android.flightapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zizoh on 02/03/2018.
 */

public class RoundTripBusinessClassFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.round_trip_class_type_fragment, container, false);
        //scrollView = (ScrollView) view.findViewById(R.id.round_trip_scrollview);
        return view;
    }
}
