package com.perasia.mvpdemo.presenter.activityPresenter;


public interface ILoginPresenter {
    void clear();

    void doLogin(String name, String password);

    void setProgressBarVisibility(int visibility);
}
