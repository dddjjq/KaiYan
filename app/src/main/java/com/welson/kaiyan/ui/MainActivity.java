package com.welson.kaiyan.ui;

import android.view.View;

import androidx.lifecycle.ViewModel;

import com.welson.kaiyan.databinding.ActivityMainBinding;
import com.welson.kaiyan.ui.base.activity.BaseActivity;
import com.welson.kaiyan.ui.fragment.home.HomeFragment;

public class MainActivity extends BaseActivity {

    ActivityMainBinding mBinding;

    @Override
    public View getRootView() {
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public ViewModel getViewModel() {
        return null;
    }

    @Override
    public void initData() {
        newFragment(new HomeFragment(),mBinding.mainContainer.getId());
    }

    @Override
    public void addListener() {

    }
}
