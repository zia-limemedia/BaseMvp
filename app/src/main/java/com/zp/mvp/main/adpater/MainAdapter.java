package com.zp.mvp.main.adpater;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zp.mvp.R;
import com.zp.mvp.main.bean.MainBean;
import com.zp.mvp.util.ImageLoader;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018/2/28.
 */

public class MainAdapter extends BaseQuickAdapter<MainBean.DetailBean.RvEventListBean, MainAdapter.ViewHodler> {

    public MainAdapter() {
        super(R.layout.item_list_new);
    }

    @Override
    protected void convert(ViewHodler helper, MainBean.DetailBean.RvEventListBean item) {
        helper.bind(item);
    }

    class ViewHodler extends BaseViewHolder {

        @BindView(R.id.iv_logo1)
        ImageView ivLogo1;
        @BindView(R.id.tv_river_name2)
        TextView tvRiverName2;
        @BindView(R.id.event_type3)
        TextView eventType3;
        @BindView(R.id.tv_content4)
        TextView tvContent4;
        @BindView(R.id.tv_date5)
        TextView tvDate5;
        @BindView(R.id.tv_area6)
        TextView tvArea6;

        public ViewHodler(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        private void bind(MainBean.DetailBean.RvEventListBean item) {
            ImageLoader.loadCenterCrop(itemView.getContext(), item.getImg_path(), ivLogo1);
            tvRiverName2.setText(item.getRv_name());
            tvArea6.setText(item.getAd_name());
            eventType3.setText(item.getEvent_type_name());
            tvContent4.setText(item.getEvent_describe());
            tvDate5.setText(item.getReport_time());
        }
    }
}
