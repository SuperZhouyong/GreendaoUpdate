package com.example.administrator.greendaoutil;

import android.app.Application;

import com.example.greendaohelper.DaoManager;

/**
 * @data 2017/3/16 0016
 * @aurher Administrator
 */

public class BaseAppliction extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DaoManager.init(this);
    }
}
