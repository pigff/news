package com.example.greedy.news.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.greedy.news.ui.NewsListFragment;

import java.util.List;

/**
 * Created by greedy on 16/10/18.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private List<String> mTitles;

    private List<NewsListFragment> mListFragments;

    public PagerAdapter(FragmentManager fm, List<String> titles, List<NewsListFragment> listFragments) {
        super(fm);
        mTitles = titles;
        mListFragments = listFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mListFragments.get(position);
    }

    @Override
    public int getCount() {
        return mTitles.size();
    }
}
