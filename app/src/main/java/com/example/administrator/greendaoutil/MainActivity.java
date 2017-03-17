package com.example.administrator.greendaoutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gen.userDao;
import com.example.greendaohelper.DaoManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        userDao userDao = DaoManager.getInstance().getDaoSession().getUserDao();
        // 拿到你就直接操作数据库，简单增删改查就不说了！
    }
}
