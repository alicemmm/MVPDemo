package com.perasia.mvpdemo.presenter.activityPresenter;

import android.os.Handler;
import android.os.Looper;

import com.perasia.mvpdemo.model.IUser;
import com.perasia.mvpdemo.model.UserModel;
import com.perasia.mvpdemo.view.ILoginView;

public class LoginPresenterImpl implements ILoginPresenter {
    ILoginView iLoginView;
    IUser user;
    Handler handler;

    public LoginPresenterImpl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        initUser();
        handler = new Handler(Looper.getMainLooper());
    }

    private void initUser() {
        user = new UserModel("asia", "asia");
    }

    @Override
    public void clear() {
        iLoginView.onClearText();
    }

    @Override
    public void doLogin(String name, String password) {
        Boolean isLoginSuccess = true;
        final int code = user.checkUserValidity(name, password);
        if (code != 0) isLoginSuccess = false;
        final Boolean result = isLoginSuccess;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iLoginView.onLoginResult(result, code);
            }
        }, 3000);
    }

    @Override
    public void setProgressBarVisibility(int visibility) {
        iLoginView.onSetProgressBarVisibility(visibility);
    }
}
