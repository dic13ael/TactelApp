package com.example.amandaeliasson.tactelapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
    public static String ARG_HEADER = "ARG_HEADER";
    public static String ARG_BODY = "ARG_BODY";
    public static String ARG_LINK = "ARG_LINK";

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
                String header = newsItem.getHeader();
                String body = newsItem.getBody();
                String link = newsItem.getLink();
                intent.putExtra(ARG_BODY, body);
                intent.putExtra(ARG_LINK, link);
                intent.putExtra(ARG_HEADER,header);
                context.startActivity(intent);

            }
        });
    }


}
