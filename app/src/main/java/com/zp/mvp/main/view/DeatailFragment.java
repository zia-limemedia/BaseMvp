package com.zp.mvp.main.view;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zp.mvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportFragment;
import me.yokeyword.fragmentation.anim.FragmentAnimator;


public class DeatailFragment extends SupportFragment {


    @BindView(R.id.pop)
    TextView pop;
    Unbinder unbinder;

    public static DeatailFragment newInstance() {
        Bundle args = new Bundle();
        DeatailFragment fragment = new DeatailFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_deatail, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public FragmentAnimator onCreateFragmentAnimator() {
        return new FragmentAnimator(R.anim.push_left_in, R.anim.push_left_out);
    }


    @Override
    public void onDestroy() {
        Bundle bundle = new Bundle();
        bundle.putString("xxx", "这是返回值");
        setFragmentResult(200, bundle);
        super.onDestroy();
        unbinder.unbind();
    }


    @OnClick(R.id.pop)
    public void onViewClicked() {
        pop();
    }
}
