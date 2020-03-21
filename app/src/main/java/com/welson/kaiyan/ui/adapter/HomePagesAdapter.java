package com.welson.kaiyan.ui.adapter;

import com.welson.kaiyan.ui.base.fragment.BaseFragment;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HomePagesAdapter extends FragmentPagerAdapter {

    private FragmentManager mFragmentManager;
    private List<BaseFragment> mBaseFragments;

    public HomePagesAdapter(FragmentManager fragmentManager, List<BaseFragment> fragments){
        super(fragmentManager);
        mFragmentManager = fragmentManager;
        mBaseFragments = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mBaseFragments.get(position);
    }

    @Override
    public int getCount() {
        if (mBaseFragments != null){
            return mBaseFragments.size();
        }
        return 0;
    }
}
