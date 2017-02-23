package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final int PAGE_COUNT = 4;
    private Context context;

    public TourFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelFragment();
        } else if (position == 1){
            return new SportFragment();
        } else if (position == 2){
            return new FoodFragment();
        } else {
            return new ParkFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_hotels);
        } else if (position == 1){
            return context.getString(R.string.category_sport);
        } else if (position == 2){
            return context.getString(R.string.category_food);
        } else {
            return context.getString(R.string.category_parks);
        }
    }
}
