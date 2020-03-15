package com.welson.kaiyan.ui.fragment;

import com.welson.kaiyan.R;
import com.welson.kaiyan.databinding.FragmentDiscoverBinding;
import com.welson.kaiyan.ui.base.BaseFragment;
import com.welson.kaiyan.ui.viewmodel.DiscoverViewModel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

public class DiscoverFragment extends BaseFragment<FragmentDiscoverBinding,DiscoverViewModel> {

    @Override
    public int getLayoutId() {
        return R.layout.fragment_discover;
    }

    @Override
    public DiscoverViewModel getViewModel() {
        return ViewModelProviders.of(getActivity()).get(DiscoverViewModel.class);
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
