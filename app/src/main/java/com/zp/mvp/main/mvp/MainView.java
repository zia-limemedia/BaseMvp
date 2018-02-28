package com.zp.mvp.main.mvp;

import com.zp.mvp.main.bean.MainBean;

import java.util.List;

/**
 * Created by Administrator on 2018/2/28.
 */

public interface MainView {

    void getData(List<MainBean.DetailBean.RvEventListBean> rvEventList);

    void getMoreData(List<MainBean.DetailBean.RvEventListBean> rvEventList);

    void error();

    void end();
}
