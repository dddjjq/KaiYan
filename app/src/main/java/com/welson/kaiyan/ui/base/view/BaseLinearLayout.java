package com.welson.kaiyan.ui.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public abstract class BaseLinearLayout extends LinearLayout {

    public BaseLinearLayout(Context context) {
        super(context);
        init(context,null);
    }

    public BaseLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    private void init(Context context,AttributeSet attrs) {
        LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        initView(context,attrs);
        initData();
        addListener();
    }

    public abstract int getLayoutId();

    public abstract void initView(Context context,AttributeSet attrs);

    public abstract void initData();

    public abstract void addListener();
}
