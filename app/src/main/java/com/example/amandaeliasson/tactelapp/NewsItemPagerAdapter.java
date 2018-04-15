package com.example.amandaeliasson.tactelapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.List;

/**
 * Created by amandaeliasson on 2018-04-15.
 */

public class NewsItemPagerAdapter extends FragmentPagerAdapter {
    List<NewsItem> newsItems;
    List<Fragment> fragments;

    public NewsItemPagerAdapter(FragmentManager fm, List<NewsItem> newsItems) {
        super(fm);
        this.newsItems = newsItems;
        int i = 0;
        while(i < newsItems.size()){
            Fragment f = new NewsItemFragment();
            Bundle args = new Bundle();
            for(int j = 0; j<0; j++){

            }
        }
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
