package com.venndingal.tutotial_tabbedactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by keng on 06/09/16.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        if (position == 0){
            return new PlaceHolderFragment1();
        }else if (position == 1){
            return new PlaceHolderFragment2();
        }else if (position == 2){
            return new PlaceHolderFragment3();
        }else{
            return new PlaceHolderFragment4();
        }

    }
    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "1";
            case 1:
                return "2";
            case 2:
                return "3";
            case 3:
                return "4";
        }
        return null;
    }
}