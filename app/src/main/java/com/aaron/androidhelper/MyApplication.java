package com.aaron.androidhelper;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

/**
 * @author Aaron
 * @date 2016/10/16 10:49
 * @description
 */

public class MyApplication extends Application {

    @SuppressLint("StaticFieldLeak")
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
