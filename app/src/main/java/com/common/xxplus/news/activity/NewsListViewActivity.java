package com.common.xxplus.news.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.common.xxplus.R;
import com.common.xxplus.news.adapter.NewsListAdapter;
import com.common.xxplus.news.view.NewsListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2015/11/24.
 */
public class NewsListViewActivity extends Activity{

    private NewsListView mNewsListView;
    private List<String> mTitles;
    private NewsListAdapter mNewsListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_news_main_listview);

        initDatas();
        initViews();
    }

    private void initViews() {
        mNewsListView = (NewsListView) findViewById(R.id.id_list_view_news);
        mNewsListView.setAdapter(new NewsListAdapter(this, mTitles));
        mNewsListView.addFooterView(LayoutInflater.from(this).inflate(R.layout.layout_news_main_listview_footer, null));
    }

    private void initDatas() {
        mTitles = new ArrayList<>();
        for(int i = 'A'; i <= 'Z'; i++){
            mTitles.add(String.valueOf((char)i));
        }
    }
}
