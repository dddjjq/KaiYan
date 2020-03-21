package com.welson.kaiyan.ui.fragment.home;

import android.view.View;

import com.welson.kaiyan.databinding.FragmentHomeRecommendBinding;
import com.welson.kaiyan.ui.base.fragment.BaseRequestFragment;

import androidx.lifecycle.ViewModel;

public class RecommendFragment extends BaseRequestFragment {

    private FragmentHomeRecommendBinding mBinding;

    @Override
    public View getRootView() {
        mBinding = FragmentHomeRecommendBinding.inflate(getLayoutInflater());
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
