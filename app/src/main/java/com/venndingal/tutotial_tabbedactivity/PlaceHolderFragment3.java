package com.venndingal.tutotial_tabbedactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlaceHolderFragment3 extends Fragment {

    public PlaceHolderFragment3() {
    }

    public static PlaceHolderFragment3 newInstance() {
        PlaceHolderFragment3 fragment = new PlaceHolderFragment3();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main3, container, false);
        return rootView;
    }
}