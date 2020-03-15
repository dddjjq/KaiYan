package com.welson.kaiyan.ui.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

public abstract class BaseRelativeLayout extends RelativeLayout {

    public BaseRelativeLayout(Context context) {
        super(context);
        init(context);
    }

    public BaseRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        initView(context);
        initData();
        addListener();
    }

    public abstract int getLayoutId();

    public abstract void initView(Context context);

    public abstract void initData();

    public abstract void addListener();
}
