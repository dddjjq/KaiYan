package com.welson.kaiyan.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;
import com.welson.kaiyan.R;

import androidx.viewpager.widget.ViewPager;

public class MainToolBar extends Toolbar {

    private TabLayout tabLayout;
    private ImageView imageView;
    private TabLayout.OnTabSelectedListener mOnTabSelectedListener;

    public MainToolBar(Context context) {
        super(context);
        init(context, null);
    }

    public MainToolBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.view_toolbar_main, this, true);
        tabLayout = findViewById(R.id.toolbar_tab);
        imageView = findViewById(R.id.toolbar_right_image);
        addListener();
    }

    private void addListener() {
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (mOnTabSelectedListener != null) {
                    mOnTabSelectedListener.onTabSelected(tab);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                if (mOnTabSelectedListener != null) {
                    mOnTabSelectedListener.onTabUnselected(tab);
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                if (mOnTabSelectedListener != null) {
                    mOnTabSelectedListener.onTabReselected(tab);
                }
            }
        });
    }

    public void setImageView(int resId) {
        imageView.setImageResource(resId);
    }

    /**
     * 这里重新设置tab的标题，viewpager数量需要和tabs一致
     * @param viewPager
     * @param tabs
     */
    public void setupViewPager(ViewPager viewPager, String[] tabs) {
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < tabs.length; i++) {
            tabLayout.getTabAt(i).setText(tabs[i]);
        }
    }

    public void setTabSelectListener(TabLayout.OnTabSelectedListener onTabSelectedListener) {
        mOnTabSelectedListener = onTabSelectedListener;
    }
}
