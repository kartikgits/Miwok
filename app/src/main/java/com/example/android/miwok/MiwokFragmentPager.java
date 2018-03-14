package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Kartikeya on 6/23/2017.
 */

public class MiwokFragmentPager extends FragmentPagerAdapter {

    private String[] tabText;
    private Context mContext;

    public MiwokFragmentPager(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.mContext = context;
        this.tabText = new String[]{
                "Numbers",
                "Family Members",
                "Colors",
                "Phrases"
        };
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyMembersFragment();
        } else if (position == 2){
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabText[position];
    }

}
