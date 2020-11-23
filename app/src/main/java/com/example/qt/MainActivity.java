package com.example.qt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private FrameLayout fl_body;
    private TextView tv_main;
    private TextView tv_my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        fl_body = findViewById(R.id.fl_body);//界面
        /*
        * 文字*/
        tv_main = findViewById(R.id.tv_main);
        tv_my = findViewById(R.id.tv_my);

    }
}
