package com.zp.mvp.main.mvp;


import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.zp.mvp.base.BasePresenter;
import com.zp.mvp.main.bean.MainBean;

import java.util.List;

/**
 * Created by Administrator on 2018/2/28.
 */

public class MainPresenter extends BasePresenter<MainView> {

    private static final String URL = "http://120.79.90.233:8080/qxhzz/app/getRvEventListForEventMgt.action";

    public void getData(final int page) {
        final MainView view = getView();

        if (view == null) {
            return;
        }
        OkGo.<String>post(URL)
                .tag(URL)
                .params("uid", 408)
                .params("reporter", 404)
                .params("rows", 10)
                .params("event_status", 0)
                .params("page", page)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        String body = response.body();
                        MainBean bean = new Gson().fromJson(body, MainBean.class);

                        List<MainBean.DetailBean.RvEventListBean> rvEventList = bean.getDetail().getRvEventList();
                        if (page == 1) {
                            view.getData(rvEventList);
                        } else {
                            view.getMoreData(rvEventList);
                        }
                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);
                        view.error();
                    }

                    @Override
                    public void onFinish() {
                        super.onFinish();
                        view.end();
                    }
                });
    }
}
