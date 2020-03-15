package com.welson.kaiyan.ui.base;

public interface BaseView<T> {
    void showSuccess(T t);

    void showError();

    void showNetworkError();
}
