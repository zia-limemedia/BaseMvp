package com.zp.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by Administrator on 2018/2/28.
 */

public abstract class BaseActivity<V, P extends BasePresenter<V>> extends SupportActivity {

    public P mPresenter;
    private Unbinder unbinder;
    public static final String TAG = "android";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        if (setContentViewId() != 0) {
            setContentView(setContentViewId());
        }
        mPresenter = creatPresenter();
        if (mPresenter != null) {
            mPresenter.attachView((V) this);
        }
        unbinder = ButterKnife.bind(this);
        initView();
        initData();


    }

    //得到当前界面的布局文件id(由子类实现)
    protected abstract int setContentViewId();

    public abstract P creatPresenter();


    //在setContentView()调用之前调用
    public void init() {

    }

    public void initView() {

    }

    public void initData() {

    }


    public P getPresenter() {
        return mPresenter;
    }

    @Override
    protected void onDestroy() {
        if (unbinder != null) {
            unbinder.unbind();
        }
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
