package com.ch.mall.custom;

/**
 * Created by lenovo on 2016/6/11.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ListViewForScrollView extends ListView {

    public ListViewForScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    @Override
    /**
     * 重写该方法，达到使ListView适应ScrollView的效果
     */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
