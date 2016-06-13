package com.ch.mall.requestdata;

import android.os.Handler;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by lenovo on 2016/6/11.
 */
public class Okhttpget {
    /**
     * get请求json的方法
     * handler 返回的send值是：（成功：1。失败：2。）
     *
     * @param url
     * @param handler
     */
    public static void getJson(String url, final Handler handler) {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(10, TimeUnit.SECONDS);
        okHttpClient.setWriteTimeout(10, TimeUnit.SECONDS);
        okHttpClient.setReadTimeout(30, TimeUnit.SECONDS);
        Request request = new Request.Builder().url(url).build();

        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                handler.sendMessage(handler.obtainMessage(2, request));
            }
            @Override
            public void onResponse(Response response) throws IOException {
                String string = response.body().string();
                handler.sendMessage(handler.obtainMessage(1, string));
            }
        });
    }

    /**
     * post请求json的方法
     * handler 返回的send值是：（成功：1。失败：2。）
     *
     * @param url
     * @param handler
     * @param builder
     * FormEncodingBuilder builder = new FormEncodingBuilder();
     * builder.add("username", "")
     */
    public void postJson(String url, final Handler handler,FormEncodingBuilder builder) {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(10, TimeUnit.SECONDS);
        okHttpClient.setWriteTimeout(10, TimeUnit.SECONDS);
        okHttpClient.setReadTimeout(30, TimeUnit.SECONDS);
        Request request = new Request.Builder()
                .url(url)
                .post(builder.build())
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                String string = response.body().string();
                handler.sendMessage(handler.obtainMessage(1, string));
            }
        });
    }
}
