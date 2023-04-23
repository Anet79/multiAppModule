package com.anet.common;

import android.app.Application;

import com.anet.common.utils.MSP;

public class App_parent extends Application {

    protected static Class<?> statsClass;

    @Override
    public void onCreate() {
        super.onCreate();
        MSP.initHelper(this);
    }
}
