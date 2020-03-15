package com.welson.kaiyan.ui.base.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;

public abstract class BaseActivity<T extends ViewDataBinding, V extends ViewModel> extends AppCompatActivity {

    protected T mBinding;
    protected V mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, getLayoutId());
        mViewModel = getViewModel();
        initData();
        addListener();
    }

    public abstract int getLayoutId();

    public abstract V getViewModel();

    public abstract void initData();

    public abstract void addListener();
}
