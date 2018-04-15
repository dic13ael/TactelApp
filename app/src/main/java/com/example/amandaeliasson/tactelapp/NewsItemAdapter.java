package com.example.amandaeliasson.tactelapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by amandaeliasson on 2018-04-15.
 */

public class NewsItemAdapter extends ArrayAdapter<NewsItem> {
    private  Context context;
    public NewsItemAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        NewsItem newsItem = getItem(position);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        NewsListItem listItem = (NewsListItem) inflater.inflate(R.layout.list_item, null);
        listItem.setNewsItem(newsItem);
        return listItem;

    }
}
