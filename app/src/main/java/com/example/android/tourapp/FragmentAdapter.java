package com.example.android.tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new WelcomeFragment();
        } else if (position == 1) {
            return new CenterFragment();
        } else if (position == 2) {
            return new WestFragment();
        } else if (position == 3) {
            return new EastFragment();
        } else {
            return new OldCityFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Welcome);
        } else if (position == 1) {
            return mContext.getString(R.string.Center);
        } else if (position == 2) {
            return mContext.getString(R.string.West);
        } else if (position == 3) {
            return mContext.getString(R.string.East);
        } else {
            return mContext.getString(R.string.OldCity);
        }
    }
}

