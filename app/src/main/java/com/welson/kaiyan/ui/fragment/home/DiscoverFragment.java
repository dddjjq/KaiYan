package com.welson.kaiyan.ui.fragment.home;

import android.view.View;

import com.welson.kaiyan.R;
import com.welson.kaiyan.databinding.FragmentDiscoverBinding;
import com.welson.kaiyan.ui.base.fragment.BaseRequestFragment;
import com.welson.kaiyan.ui.viewmodel.home.DiscoverViewModel;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

public class DiscoverFragment extends BaseRequestFragment<FragmentDiscoverBinding,DiscoverViewModel> {

    private FragmentDiscoverBinding mBinding;

    @Override
    public View getRootView() {
        mBinding = FragmentDiscoverBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public DiscoverViewModel getViewModel() {
        return new ViewModelProvider(this).get(DiscoverViewModel.class);
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
