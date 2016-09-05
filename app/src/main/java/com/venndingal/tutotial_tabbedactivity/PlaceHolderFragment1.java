package com.venndingal.tutotial_tabbedactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlaceHolderFragment1 extends Fragment {
    public PlaceHolderFragment1() {
    }
    public static PlaceHolderFragment1 newInstance() {
        PlaceHolderFragment1 fragment = new PlaceHolderFragment1();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main1, container, false);
        return rootView;
    }
}