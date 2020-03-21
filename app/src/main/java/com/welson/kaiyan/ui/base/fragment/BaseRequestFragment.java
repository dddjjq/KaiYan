package com.welson.kaiyan.ui.base.fragment;

import com.welson.kaiyan.ui.base.view.BaseView;

import androidx.lifecycle.ViewModel;

public abstract class BaseRequestFragment<V extends ViewModel,E>
        extends BaseFragment implements BaseView<E> {

}
