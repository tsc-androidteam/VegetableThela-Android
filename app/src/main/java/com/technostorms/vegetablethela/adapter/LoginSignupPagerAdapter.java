package com.technostorms.vegetablethela.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class LoginSignupPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments = new ArrayList<>();

    public LoginSignupPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void add(Fragment frag) {
        fragments.add(frag);
//        namePage.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
