package com.ch.mall.dmall;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.ch.mall.fragment.Home;
import com.ch.mall.fragment.My;
import com.ch.mall.fragment.Shop;
import com.ch.mall.fragment.Sort;
import com.ch.mall.fragment.Total;


public class HostActivity extends FragmentActivity implements View.OnClickListener {

    private ImageView home;
    private ImageView sort;
    private ImageView shop;
    private ImageView my;
    private FragmentTransaction ft;
    private Home fhome;
    private Sort fsort;
    private Shop fshop;
    private My fmy;
    private Total ftotal;
    private ImageView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
        initview();
       indata();
    }

    private void indata() {

        fhome = new Home();
        fsort = new Sort();
        fshop = new Shop();
        ftotal = new Total();
        fmy = new My();
        FragmentManager fm=getSupportFragmentManager();
        ft =   fm.beginTransaction();
        home.setImageResource(R.mipmap.homea);
        ft.add(R.id.rl, fhome, "f1").add(R.id.rl, fsort, "f2").add(R.id.rl, fshop, "f3").add(R.id.rl, fmy,"f4").add(R.id.rl,ftotal,"f5").show(fhome).hide(fsort).hide(fshop).hide(fmy).commit();

        home.setOnClickListener(this);
        sort.setOnClickListener(this);
        shop.setOnClickListener(this);
        my.setOnClickListener(this);
        total.setOnClickListener(this);
    }

    private void initview() {
        home = (ImageView) findViewById(R.id.home);
        sort = (ImageView) findViewById(R.id.sort);
        shop = (ImageView) findViewById(R.id.shop);
        my = (ImageView) findViewById(R.id.my);
        total = (ImageView) findViewById(R.id.total);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.home:
                FragmentManager fm1=getSupportFragmentManager();
                ft = fm1.beginTransaction();
                ft.show(fhome).hide(fsort).hide(fshop).hide(fmy).hide(ftotal).commit();
                sort.setImageResource(R.mipmap.shop);
                home.setImageResource(R.mipmap.homea);
                total.setImageResource(R.mipmap.go);
                shop.setImageResource(R.mipmap.shop);
                my.setImageResource(R.mipmap.my);
                return;
            case R.id.sort:
                FragmentManager fm2=getSupportFragmentManager();
                ft = fm2.beginTransaction();
                ft.show(fsort).hide(fhome).hide(fshop).hide(fmy).hide(ftotal).commit();
                sort.setImageResource(R.mipmap.shopa);
                home.setImageResource(R.mipmap.home);
                total.setImageResource(R.mipmap.go);
                shop.setImageResource(R.mipmap.shop);
                my.setImageResource(R.mipmap.my);
                return;
            case R.id.shop:
                FragmentManager fm3=getSupportFragmentManager();
                ft = fm3.beginTransaction();
                ft.show(fshop).hide(fhome).hide(fsort).hide(fmy).hide(ftotal).commit();
                sort.setImageResource(R.mipmap.shop);
                home.setImageResource(R.mipmap.home);
                total.setImageResource(R.mipmap.go);
                shop.setImageResource(R.mipmap.shopa);
                my.setImageResource(R.mipmap.my);
                return;
            case R.id.my:
                FragmentManager fm4=getSupportFragmentManager();
                ft = fm4.beginTransaction();
                ft.show(fmy).hide(fhome).hide(fsort).hide(fshop).hide(ftotal).commit();
                sort.setImageResource(R.mipmap.shop);
                home.setImageResource(R.mipmap.home);
                total.setImageResource(R.mipmap.go);
                shop.setImageResource(R.mipmap.shop);
                my.setImageResource(R.mipmap.mya);
                return;
            case R.id.total:
                FragmentManager fm5=getSupportFragmentManager();
                ft = fm5.beginTransaction();
                ft.show(ftotal).hide(fhome).hide(fsort).hide(fshop).hide(fmy).commit();
                sort.setImageResource(R.mipmap.shop);
                home.setImageResource(R.mipmap.home);
                total.setImageResource(R.mipmap.goa);
                shop.setImageResource(R.mipmap.shop);
                my.setImageResource(R.mipmap.my);
                return;
        }
    }
}
