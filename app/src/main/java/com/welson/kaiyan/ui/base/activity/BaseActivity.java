package com.welson.kaiyan.ui.base.activity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;

public abstract class BaseActivity<V extends ViewModel> extends AppCompatActivity {

    protected V mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(getRootView());
        mViewModel = getViewModel();
        initData();
        addListener();
    }

    public abstract View getRootView();

    public abstract V getViewModel();

    public abstract void initData();

    public abstract void addListener();
}
