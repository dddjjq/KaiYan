package com.welson.kaiyan.ui.fragment.home;

import android.util.Log;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.welson.kaiyan.R;
import com.welson.kaiyan.databinding.FragmentHomeBinding;
import com.welson.kaiyan.ui.adapter.HomePagesAdapter;
import com.welson.kaiyan.ui.base.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.ViewModel;

/**
 * 主类型首页
 */
public class HomeFragment extends BaseFragment {

    private FragmentHomeBinding mBinding;
    private List<BaseFragment> mBaseFragments;

    @Override
    public View getRootView() {
        mBinding = FragmentHomeBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public ViewModel getViewModel() {
        return null;
    }

    @Override
    public void initData() {
        mBaseFragments = new ArrayList<>();
        mBaseFragments.add(new DiscoverFragment());
        mBaseFragments.add(new RecommendFragment());
        mBaseFragments.add(new DailyFragment());
        mBinding.homeViewpager.setAdapter(new HomePagesAdapter(getActivity().getSupportFragmentManager(),mBaseFragments));
    }

    @Override
    public void addListener() {
        mBinding.homeToolbar.setTabSelectListener(mOnTabSelectedListener);
        mBinding.homeToolbar.setupViewPager(mBinding.homeViewpager,getResources().getStringArray(R.array.home_tab));
    }

    private TabLayout.OnTabSelectedListener mOnTabSelectedListener = new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            int position = tab.getPosition();
            mBinding.homeViewpager.setCurrentItem(position);
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    };
}
