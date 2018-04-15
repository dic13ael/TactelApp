package com.example.amandaeliasson.tactelapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.example.amandaeliasson.tactelapp.DetailActivity;
import com.example.amandaeliasson.tactelapp.NewsItem;

/**
 * Created by amandaeliasson on 2018-04-15.
 */

public class ListItem extends TextView {
    NewsItem newsItem;
    public ListItem(Context context) {
        super(context);
    }
    public ListItem(Context context, NewsItem newsItem){
        super(context);
        this.newsItem = newsItem;
        setText(newsItem.getHeader());
        init(context);
    }

    public ListItem(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ListItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ListItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    public void init(final Context context) {
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                context.startActivity(intent);
            }
        });
    }


}
