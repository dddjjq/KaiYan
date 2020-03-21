package com.welson.kaiyan.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.welson.kaiyan.R;
import com.welson.kaiyan.ui.base.view.BaseLinearLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

public class BottomBarView extends BaseLinearLayout implements OnItemClickListener, View.OnClickListener {

    private BottomBarItemView homeItem;
    private BottomBarItemView communityItem;
    private BottomBarItemView noticeItem;
    private BottomBarItemView mineItem;
    private ImageView addBtn;
    private OnBottomItemSelectListener onBottomItemSelectListener;
    private List<BottomBarItemView> bottomBarItemViews;

    public BottomBarView(Context context) {
        super(context);
    }

    public BottomBarView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public int getLayoutId() {
        return R.layout.view_bottom_bar_layout;
    }

    @Override
    public void initView(Context context, AttributeSet attrs) {
        bottomBarItemViews = new ArrayList<>();
        homeItem = findViewById(R.id.bottom_bar_home);
        communityItem = findViewById(R.id.bottom_bar_community);
        noticeItem = findViewById(R.id.bottom_bar_notice);
        mineItem = findViewById(R.id.bottom_bar_mine);
        addBtn = findViewById(R.id.bottom_bar_add);
        bottomBarItemViews.add(homeItem);
        bottomBarItemViews.add(communityItem);
        bottomBarItemViews.add(noticeItem);
        bottomBarItemViews.add(mineItem);
        homeItem.setSelected(true);
    }

    @Override
    public void initData() {

    }

    @Override
    public void addListener() {
        homeItem.setOnItemClickListener(this);
        communityItem.setOnItemClickListener(this);
        noticeItem.setOnItemClickListener(this);
        mineItem.setOnItemClickListener(this);
        addBtn.setOnClickListener(this);
    }

    public void setOnBottomItemSelectListener(OnBottomItemSelectListener onBottomItemSelectListener) {
        this.onBottomItemSelectListener = onBottomItemSelectListener;
    }

    @Override
    public void onClick(View v) {
        if (onBottomItemSelectListener != null) {
            onBottomItemSelectListener.onAddClick();
        }
    }

    @Override
    public void onItemClick(View view) {
        setSelect(view);
        if (onBottomItemSelectListener == null) return;
        switch (view.getId()) {
            case R.id.bottom_bar_home:
                onBottomItemSelectListener.onHomeSelect();
                break;
            case R.id.bottom_bar_community:
                onBottomItemSelectListener.onCommunitySelect();
                break;
            case R.id.bottom_bar_notice:
                onBottomItemSelectListener.onNoticeSelect();
                break;
            case R.id.bottom_bar_mine:
                onBottomItemSelectListener.onMineSelect();
                break;
        }
    }

    private void setSelect(View view) {
        for (BottomBarItemView barItemView : bottomBarItemViews) {
            if (barItemView.getId() == view.getId()) {
                barItemView.setSelected(true);
            } else {
                barItemView.setSelected(false);
            }
        }
    }

    public interface OnBottomItemSelectListener {
        void onHomeSelect();

        void onCommunitySelect();

        void onNoticeSelect();

        void onMineSelect();

        void onAddClick();
    }
}
