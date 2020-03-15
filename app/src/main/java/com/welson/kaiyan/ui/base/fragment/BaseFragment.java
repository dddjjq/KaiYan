package com.welson.kaiyan.ui.base.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

/**
 * 主页互相切换的三个fragment
 */
@SuppressWarnings("unchecked")
public abstract class BaseFragment<T extends ViewDataBinding, V extends ViewModel>
        extends Fragment {

    protected T mBinding;
    protected V mViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        addListener();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = getViewModel();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public abstract int getLayoutId();

    public abstract V getViewModel();

    public abstract void initData();

    public abstract void addListener();
}
