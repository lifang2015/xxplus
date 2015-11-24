package com.common.xxplus.news.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by admin on 2015/11/22.
 */
public class NewsListView extends ListView{

    public NewsListView(Context context) {
        this(context, null);
    }

    public NewsListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NewsListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
