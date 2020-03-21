package com.welson.kaiyan.ui.fragment.home;

import android.view.View;

import com.welson.kaiyan.R;
import com.welson.kaiyan.databinding.FragmentHomeDiscoverBinding;
import com.welson.kaiyan.model.BaseData;
import com.welson.kaiyan.ui.base.fragment.BaseRequestFragment;
import com.welson.kaiyan.ui.viewmodel.home.DiscoverViewModel;

import androidx.lifecycle.ViewModelProvider;

public class DiscoverFragment extends BaseRequestFragment<DiscoverViewModel, BaseData> {

    private FragmentHomeDiscoverBinding mBinding;

    @Override
    public View getRootView() {
        mBinding = FragmentHomeDiscoverBinding.inflate(getLayoutInflater());
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
    public void showSuccess(BaseData baseData) {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showNetworkError() {

    }
}
