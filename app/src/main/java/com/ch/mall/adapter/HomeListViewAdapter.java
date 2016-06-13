package com.ch.mall.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ch.mall.dmall.R;
import com.ch.mall.vo.Goods;
import com.lidroid.xutils.BitmapUtils;

import java.util.List;

/**
 * Created by lenovo on 2016/6/12.
 */
public class HomeListViewAdapter extends BaseAdapter {
    List<Goods.ResultsBean> list;
    Context context;
    public HomeListViewAdapter(List<Goods.ResultsBean> list, Context context) {
       this.list=list;
        this.context=context;
    }

    @Override
    public int getCount() {


        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView=View.inflate(context, R.layout.homelistviewadapter,null);
            viewHolder=new ViewHolder();
            viewHolder.image= (ImageView) convertView.findViewById(R.id.homeimage);
            viewHolder.text1= (TextView) convertView.findViewById(R.id.hometext1);
            viewHolder.text2= (TextView) convertView.findViewById(R.id.hometext2);
            convertView.setTag(viewHolder);
        }else{
                 viewHolder= (ViewHolder) convertView.getTag();
        }
        BitmapUtils utils=new BitmapUtils(context);
        utils.display(viewHolder.image,list.get(position).getAdvert_pic());
        viewHolder.text1.setText(list.get(position).getTips());
        viewHolder.text2.setText(list.get(position).getContents());
        return convertView;
    }
    class ViewHolder{
        ImageView image;
        TextView  text1;
        TextView  text2;
    }
}
