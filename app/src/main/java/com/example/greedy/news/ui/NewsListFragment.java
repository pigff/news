package com.example.greedy.news.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.greedy.news.R;


public class NewsListFragment extends Fragment {

    private View mView;
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_news_list, container, false);
        init();

        return mView;
    }

    private void init() {
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.recyclerview);
        mRefreshLayout = (SwipeRefreshLayout) mView.findViewById(R.id.refreshlayout);
    }
}
