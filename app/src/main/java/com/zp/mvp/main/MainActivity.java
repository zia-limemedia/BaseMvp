package com.zp.mvp.main;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zp.mvp.R;
import com.zp.mvp.main.view.MainFragment;

import me.yokeyword.fragmentation.SupportActivity;

public class MainActivity extends SupportActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment fragment = findFragment(MainFragment.class);

        if (fragment == null) {
            loadRootFragment(R.id.content, MainFragment.newInstance());
        }
    }

}
