package com.coolweather.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("新增类测试2");
    }
}
