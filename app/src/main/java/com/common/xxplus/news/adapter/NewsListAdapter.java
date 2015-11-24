package com.common.xxplus.news.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.common.xxplus.R;

import java.util.List;

/**
 * Created by admin on 2015/11/22.
 */
public class NewsListAdapter extends BaseAdapter{

    private List<String> mDatas;
    private Context context;

    public NewsListAdapter(Context context, List<String> mDatas) {
        super();
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        NewsHolder holder = null;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_news_main_item, parent, false);
            holder = new NewsHolder();
            holder.mTextView = (TextView) convertView.findViewById(R.id.id_text_view);
            convertView.setTag(holder);
        }else{
            holder = (NewsHolder) convertView.getTag();
        }

        holder.mTextView.setText(mDatas.get(position));

        return convertView;
    }

    protected class NewsHolder{
        private TextView mTextView;
    }
}
