package com.zp.mvp.main.view;


import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.kennyc.view.MultiStateView;
import com.zp.mvp.main.adpater.MainAdapter;
import com.zp.mvp.main.bean.MainBean;
import com.zp.mvp.main.mvp.MainPresenter;
import com.zp.mvp.main.mvp.MainView;
import com.zp.mvp.R;
import com.zp.mvp.base.BaseFragment;

import java.util.List;

import butterknife.BindView;


public class MainFragment extends BaseFragment<MainView, MainPresenter> implements MainView
        , SwipeRefreshLayout.OnRefreshListener, BaseQuickAdapter.RequestLoadMoreListener
        , BaseQuickAdapter.OnItemClickListener {


    @BindView(R.id.multiStateView)
    MultiStateView multiStateView;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    SwipeRefreshLayout refreshLayout;
    private MainAdapter adapter;
    private int page = 1;


    public static MainFragment newInstance() {
        Bundle args = new Bundle();
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int setContentViewId() {
        return R.layout.fragment_main;
    }

    @Override
    protected MainPresenter creatPresenter() {
        return new MainPresenter();
    }

    @Override
    protected void initView(View view) {
        super.initView(view);
        refreshLayout.setRefreshing(true);
        refreshLayout.setOnRefreshListener(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter = new MainAdapter());
        adapter.setOnLoadMoreListener(this, recyclerView);
        getPresenter().getData(page);
        adapter.setOnItemClickListener(this);
    }

    @Override
    public void getData(List<MainBean.DetailBean.RvEventListBean> rvEventList) {
        refreshLayout.setRefreshing(false);
        multiStateView.setViewState(MultiStateView.VIEW_STATE_CONTENT);
        adapter.setNewData(rvEventList);
    }

    @Override
    public void getMoreData(List<MainBean.DetailBean.RvEventListBean> rvEventList) {
        multiStateView.setViewState(MultiStateView.VIEW_STATE_CONTENT);
        if (rvEventList.size() != 0) {
            adapter.addData(rvEventList);
            adapter.loadMoreComplete();
        } else {
            adapter.loadMoreEnd();
        }

    }

    @Override
    public void error() {
        adapter.loadMoreFail();
    }

    @Override
    public void end() {

    }

    @Override
    public void onRefresh() {
        page = 1;
        getPresenter().getData(page);

    }

    @Override
    public void onLoadMoreRequested() {
        page++;
        getPresenter().getData(page);
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        startForResult(DeatailFragment.newInstance(), 200);
    }

    @Override
    public void onFragmentResult(int requestCode, int resultCode, Bundle data) {
        super.onFragmentResult(requestCode, resultCode, data);
        if (requestCode == 200 || resultCode == 200) {
            Toast.makeText(_mActivity, "" + data.get("xxx"), Toast.LENGTH_SHORT).show();
        }
    }
}
