package com.welson.kaiyan.ui.fragment.home;

import com.welson.kaiyan.R;
import com.welson.kaiyan.databinding.FragmentDiscoverBinding;
import com.welson.kaiyan.ui.base.fragment.BaseRequestFragment;
import com.welson.kaiyan.ui.viewmodel.home.DiscoverViewModel;

import androidx.lifecycle.ViewModelProviders;

public class DiscoverFragment extends BaseRequestFragment<FragmentDiscoverBinding,DiscoverViewModel> {

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
