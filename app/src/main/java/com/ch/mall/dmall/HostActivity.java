package com.ch.mall.dmall;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
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
    private long mExitTime;
    private TextView name_home;
    private TextView name_sort;
    private TextView name_total;
    private TextView name_shop;
    private TextView name_my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
        initview();
       indata();
    }
//設置每個界面
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
        name_home.setTextColor(Color.RED);
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
        name_home = (TextView) findViewById(R.id.name_home);
        name_sort = (TextView) findViewById(R.id.name_sort);
        name_total = (TextView) findViewById(R.id.name_total);
        name_shop = (TextView) findViewById(R.id.name_shop);
        name_my = (TextView) findViewById(R.id.name_my);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.home:
                FragmentManager fm1=getSupportFragmentManager();
                ft = fm1.beginTransaction();
                ft.show(fhome).hide(fsort).hide(fshop).hide(fmy).hide(ftotal).commit();
               name_home.setTextColor(Color.RED);
                name_sort.setTextColor(Color.BLACK);
                name_total.setTextColor(Color.BLACK);
                name_shop.setTextColor(Color.BLACK);
                name_my.setTextColor(Color.BLACK);
                sort.setImageResource(R.mipmap.sort);
                home.setImageResource(R.mipmap.homea);
                total.setImageResource(R.mipmap.go);
                shop.setImageResource(R.mipmap.shop);
                my.setImageResource(R.mipmap.my);
                return;
            case R.id.sort:
                FragmentManager fm2=getSupportFragmentManager();
                ft = fm2.beginTransaction();
                ft.show(fsort).hide(fhome).hide(fshop).hide(fmy).hide(ftotal).commit();
                name_home.setTextColor(Color.BLACK);
                name_sort.setTextColor(Color.RED);
                name_total.setTextColor(Color.BLACK);
                name_shop.setTextColor(Color.BLACK);
                name_my.setTextColor(Color.BLACK);
                sort.setImageResource(R.mipmap.sorta);
                home.setImageResource(R.mipmap.home);
                total.setImageResource(R.mipmap.go);
                shop.setImageResource(R.mipmap.shop);
                my.setImageResource(R.mipmap.my);
                return;
            case R.id.shop:
                FragmentManager fm3=getSupportFragmentManager();
                ft = fm3.beginTransaction();
                ft.show(fshop).hide(fhome).hide(fsort).hide(fmy).hide(ftotal).commit();
                name_home.setTextColor(Color.BLACK);
                name_sort.setTextColor(Color.BLACK);
                name_total.setTextColor(Color.BLACK);
                name_shop.setTextColor(Color.RED);
                name_my.setTextColor(Color.BLACK);
                sort.setImageResource(R.mipmap.sort);
                home.setImageResource(R.mipmap.home);
                total.setImageResource(R.mipmap.go);
                shop.setImageResource(R.mipmap.shopa);
                my.setImageResource(R.mipmap.my);
                return;
            case R.id.my:
                FragmentManager fm4=getSupportFragmentManager();
                ft = fm4.beginTransaction();
                ft.show(fmy).hide(fhome).hide(fsort).hide(fshop).hide(ftotal).commit();
                name_home.setTextColor(Color.BLACK);
                name_sort.setTextColor(Color.BLACK);
                name_total.setTextColor(Color.BLACK);
                name_shop.setTextColor(Color.BLACK);
                name_my.setTextColor(Color.RED);
                sort.setImageResource(R.mipmap.sort);
                home.setImageResource(R.mipmap.home);
                total.setImageResource(R.mipmap.go);
                shop.setImageResource(R.mipmap.shop);
                my.setImageResource(R.mipmap.mya);
                return;
            case R.id.total:
                FragmentManager fm5=getSupportFragmentManager();
                ft = fm5.beginTransaction();
                ft.show(ftotal).hide(fhome).hide(fsort).hide(fshop).hide(fmy).commit();
                name_home.setTextColor(Color.BLACK);
                name_sort.setTextColor(Color.BLACK);
                name_total.setTextColor(Color.RED);
                name_shop.setTextColor(Color.BLACK);
                name_my.setTextColor(Color.BLACK);
                sort.setImageResource(R.mipmap.sort);
                home.setImageResource(R.mipmap.home);
                total.setImageResource(R.mipmap.goa);
                shop.setImageResource(R.mipmap.shop);
                my.setImageResource(R.mipmap.my);
                return;
        }
    }
    // 点击两次返回键退出
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();

            } else {
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
