package com.perasia.mvpdemo.view;


public interface ILoginView {
    void onClearText();

    void onLoginResult(boolean result, int code);

    void onSetProgressBarVisibility(int visibility);
}
