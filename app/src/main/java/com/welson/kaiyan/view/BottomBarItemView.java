package com.welson.kaiyan.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.welson.kaiyan.R;
import com.welson.kaiyan.ui.base.view.BaseLinearLayout;

import androidx.annotation.Nullable;

public class BottomBarItemView extends BaseLinearLayout {

    private ImageView imageView;
    private TextView textView;
    private OnItemClickListener onItemClickListener;

    public BottomBarItemView(Context context) {
        super(context);
    }

    public BottomBarItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public int getLayoutId() {
        return R.layout.view_bottom_bar_item_layout;
    }

    @Override
    public void initView(Context context, AttributeSet attrs) {
        imageView = findViewById(R.id.bottom_bar_item_image);
        textView = findViewById(R.id.bottom_bar_item_text);
        if (attrs != null) {
            TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.BottomBarItemView);
            int res = ta.getResourceId(R.styleable.BottomBarItemView_bottomImage, 0);
            String text = ta.getString(R.styleable.BottomBarItemView_bottomText);
            imageView.setImageResource(res);
            textView.setText(text);
            ta.recycle();
        }
    }

    @Override
    public void initData() {

    }

    @Override
    public void addListener() {
        setClickable(true);
        setOnClickListener(v -> {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(v);
            }
        });
    }

    @Override
    public void setSelected(boolean selected) {
        imageView.setSelected(selected);
        textView.setSelected(selected);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}
