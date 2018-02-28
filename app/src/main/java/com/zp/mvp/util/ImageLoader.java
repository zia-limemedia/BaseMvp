package com.zp.mvp.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

/**
 * Created by Administrator on 2018/2/28.
 */


@GlideModule
public class ImageLoader extends AppGlideModule {

    public static void loadCenterCrop(Context context, String url, ImageView view) {
        Glide.with(context)
                .load(url)
                .transition(withCrossFade())
                .apply(new RequestOptions().centerCrop())
                .into(view);
    }

    /**
     * 带加载异常图片
     */
    public static void loadCenterCrop(Context context, String url, ImageView view, int errorResId) {
        Glide.with(context)
                .load(url)
                .transition(withCrossFade())
                .apply(new RequestOptions().centerCrop().error(errorResId))
                .into(view);
    }

    /**
     * 带监听处理
     */
    public static void loadCenterCrop(Context context, String url, ImageView view, RequestListener listener) {
        Glide.with(context)
                .load(url)
                .transition(withCrossFade())
                .apply(new RequestOptions().centerCrop())
                .listener(listener)
                .into(view);
    }
}
