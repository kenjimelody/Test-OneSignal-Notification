package com.superhardcode.test.onesignal.noti;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by Thanisak Piyasaksiri on 2/3/16 AD.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {

        super.onCreate();
        OneSignal.startInit(this).init();
    }
}
