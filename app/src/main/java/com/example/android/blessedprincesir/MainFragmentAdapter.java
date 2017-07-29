package com.example.android.blessedprincesir;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by g50 on 14-06-2017.
 */

public class MainFragmentAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Audio", "Video"};

    public MainFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AudioFragment();
        } else {
            return new VideoFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
