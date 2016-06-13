package com.ch.mall.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.ch.mall.adapter.HomeListViewAdapter;
import com.ch.mall.dmall.R;
import com.ch.mall.requestdata.Okhttpget;
import com.ch.mall.vo.Goods;
import com.google.gson.Gson;
import com.lidroid.xutils.BitmapUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2016/6/7.
 */
public class Home extends Fragment{
    private ViewPager vp;
    private LinearLayout dotcontaint;
    ArrayList<ImageView> imgs ;
    ArrayList<View> dots ;
    int currentIndex = 0;
    int olderIndex = 0;

    //图片数据
    private String[] image_url = new String[]{
            "http://i.okaybuy.cn/images/multipic/new/201606/61/61d4b28c7a1fb3d54768f4b786924af4.png",
            "http://i.okaybuy.cn/images/multipic/new/201606/93/93fb86e2eaa0a3cb036d4cf5726b3cfa.jpg",
            "http://i.okaybuy.cn/images/multipic/new/201606/fe/fe1996b16b475bbd44e744218b659bb6.jpg",
            "http://i.okaybuy.cn/images/multipic/new/201606/3e/3e0344ef628796727c7c0e49a1f44792.jpg"};

    Handler h = new Handler(){

        private Goods goods;
        private List<Goods.ResultsBean> results;

        public void handleMessage(android.os.Message msg) {
            if(msg.what==2) {
                vp.setCurrentItem(currentIndex);//设置此次要显示的pager
                //切换选中的圆点
                dots.get(olderIndex).setBackgroundResource(R.drawable.dot_nomal);//设置上次选中的圆点为不选中
                dots.get(currentIndex % image_url.length).setBackgroundResource(R.drawable.dot_focus);//设置当前选中的圆点为选中
                olderIndex = currentIndex % image_url.length;
            }
            if (msg.what==1){
                String s= (String) msg.obj;
                Gson gson=new Gson();
                goods = gson.fromJson(s,Goods.class);
                results = goods.getResults();
                BaseAdapter adapter=new HomeListViewAdapter(results,getActivity());
                listview.setAdapter(adapter);

            }
        };
    };

    private View view;
    private ListView listview;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = View.inflate(getActivity(), R.layout.home, null);
        init();

        //请求数据
        Okhttpget.getJson("http://platform.okbuy.com/app/v13/focus/advert?os=android&session_id=352284049341476&auth_sign=1e5bb1bad9c47ef528db1deb548459d7&group_id=2&page_id=4&app_id=1034&site_mask=7&version=4.4.5", h);

        return view;

    }


    public void init(){
        vp = (ViewPager) view.findViewById(R.id.vp);
        listview = (ListView)view.findViewById(R.id.listview);
        dotcontaint = (LinearLayout) view.findViewById(R.id.dotcontaint);

        //获得网络图片，配置给Veiwpager
        getImageViewList();
        //获得圆点
        getDotList();
        //设置第一个圆点为选中状态
        dots.get(0).setBackgroundResource(R.drawable.dot_focus);
        vp.setAdapter(new MyVpAdapger());//配置pager页
        int currentItem = Integer.MAX_VALUE / 2 - Integer.MAX_VALUE/2%image_url.length;
        vp.setCurrentItem(currentItem);
        //通过定时器，制作自动划动效果
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                currentIndex = vp.getCurrentItem() + 1;//下一个页

                h.sendEmptyMessage(2);//在此线程中，不能操作ui主线程
            }
        }, 3000, 2000);



    }

    private void getDotList() {
        // TODO Auto-generated method stub
        dots = new ArrayList<View>();
        //循环图片数组，创建对应数量的dot
        for(int i=0;i<image_url.length;i++){
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.dot_layout, null);//加载布局
            View dot = view.findViewById(R.id.dotView);//得到布局中的dot点组件
            //收集dot
            dots.add(dot);
            //把布局添加到线性布局
            dotcontaint.addView(view);
        }

    }
    class MyVpAdapger extends PagerAdapter{

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            // TODO Auto-generated method stub
            return arg0==arg1;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            // TODO Auto-generated method stub
//            super.destroyItem(container, position, object);
//            ImageView img = imgs.get(position);
            container.removeView((View)object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // TODO Auto-generated method stub
            int item = position%image_url.length;
            container.addView(imgs.get(item));
            return imgs.get(item);
        }

    }

    /**
     * 到网络获得图片信息，并赋值到ImageView中
     */
    private void getImageViewList() {
        // TODO Auto-generated method stub
        imgs = new ArrayList<ImageView>();
        BitmapUtils btUtil = new BitmapUtils(getActivity());
        //加载图片
        for(int i=0;i<image_url.length;i++){
            ImageView img = new ImageView(getActivity());
            img.setScaleType(ImageView.ScaleType.FIT_XY);

            btUtil.display(img, image_url[i]);
            imgs.add(img);

        }
    }



}
