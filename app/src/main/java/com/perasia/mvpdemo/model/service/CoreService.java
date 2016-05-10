package com.perasia.mvpdemo.model.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class CoreService extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
