package com.welson.kaiyan.ui.base.activity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.welson.kaiyan.ui.base.fragment.BaseFragment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
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

    public void newFragment(BaseFragment baseFragment, int id) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(id, baseFragment);
        transaction.commit();
    }

    public abstract View getRootView();

    public abstract V getViewModel();

    public abstract void initData();

    public abstract void addListener();
}
