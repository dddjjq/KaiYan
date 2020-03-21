package com.welson.kaiyan.ui.fragment.home;

import android.view.View;

import com.welson.kaiyan.databinding.FragmentHomeDailyBinding;
import com.welson.kaiyan.databinding.FragmentHomeDiscoverBinding;
import com.welson.kaiyan.ui.base.fragment.BaseRequestFragment;

import androidx.lifecycle.ViewModel;

public class DailyFragment extends BaseRequestFragment {

    private FragmentHomeDailyBinding mBinding;

    @Override
    public View getRootView() {
        mBinding = FragmentHomeDailyBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public ViewModel getViewModel() {
        return null;
    }

    @Override
    public void initData() {

    }

    @Override
    public void addListener() {

    }

    @Override
    public void showSuccess(Object o) {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showNetworkError() {

    }
}
