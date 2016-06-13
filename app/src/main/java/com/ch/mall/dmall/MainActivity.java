package com.ch.mall.dmall;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.ch.mall.autolayout.AutoLayoutActivity;


public class MainActivity extends AutoLayoutActivity {

    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==1){
                Intent intent=new Intent(MainActivity.this,HostActivity.class);
                startActivity(intent);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.sendEmptyMessageDelayed(1,5);
    }
}
