package com.common.xxplus.news.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.common.xxplus.R;

import java.util.List;

/**
 * Created by admin on 2015/11/22.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsHolder>{

    private Context context;
    private List<String> mDatas;

    public NewsAdapter(Context context, List<String> mDatas) {
        super();
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public NewsAdapter.NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        NewsHolder holder = new NewsHolder(LayoutInflater.from(context).inflate(R.layout.layout_news_main_item, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(NewsAdapter.NewsHolder holder, int position) {
        holder.mTextView.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class NewsHolder extends RecyclerView.ViewHolder{
        protected TextView mTextView;

        public NewsHolder(View itemView) {
            super(itemView);
            this.mTextView = (TextView) itemView.findViewById(R.id.id_text_view);
        }
    }

}
