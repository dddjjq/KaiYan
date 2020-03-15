package com.welson.kaiyan.ui.base.fragment;

import com.welson.kaiyan.ui.base.view.BaseView;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;

public abstract class BaseRequestFragment<T extends ViewDataBinding, V extends ViewModel>
        extends BaseFragment implements BaseView {

}
