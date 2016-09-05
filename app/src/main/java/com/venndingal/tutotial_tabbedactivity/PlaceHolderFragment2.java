package com.venndingal.tutotial_tabbedactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlaceHolderFragment2 extends Fragment {

    public PlaceHolderFragment2() {
    }
    public static PlaceHolderFragment2 newInstance() {
        PlaceHolderFragment2 fragment = new PlaceHolderFragment2();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main2, container, false);
        return rootView;
    }
}