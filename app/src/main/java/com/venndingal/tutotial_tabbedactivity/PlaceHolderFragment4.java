package com.venndingal.tutotial_tabbedactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlaceHolderFragment4 extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    public PlaceHolderFragment4() {
    }

    public static PlaceHolderFragment4 newInstance() {
        PlaceHolderFragment4 fragment = new PlaceHolderFragment4();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main4, container, false);
        return rootView;
    }
}