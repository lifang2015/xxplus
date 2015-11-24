package com.common.xxplus.news.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.common.xxplus.R;
import com.common.xxplus.news.adapter.NewsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2015/11/22.
 */
public class NewsActivity extends AppCompatActivity{

    private RecyclerView mRecyclerView;
    private List<String> mTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_news_main);

        initDatas();
        initViews();
    }

    private void initViews() {
        this.mRecyclerView = (RecyclerView) findViewById(R.id.id_recycler_view);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.mRecyclerView.setAdapter(new NewsAdapter(this, mTitles));
    }

    private void initDatas() {
        this.mTitles = new ArrayList<>();
        for(int i = 'A'; i <= 'Z'; i++){
            this.mTitles.add(String.valueOf((char)i));
        }
    }
}
