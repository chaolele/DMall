package com.ch.mall.dmall;

import android.content.Intent;
import android.os.Bundle;

import com.ch.mall.autolayout.AutoLayoutActivity;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AutoLayoutActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        延迟三秒跳转到主界面
        final Intent intent=new Intent();
        Timer timer=new Timer();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                intent.setClass(MainActivity.this,HostActivity.class);
                MainActivity.this.startActivity(intent);
            }
        };
    timer.schedule(task,3000);
    }
}
