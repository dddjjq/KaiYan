package com.welson.kaiyan.ui.base.view;

public interface BaseView<T> {
    void showSuccess(T t);

    void showError();

    void showNetworkError();
}
