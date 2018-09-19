package com.technard.bookacab.ui.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.FrameLayout;

import com.technard.bookacab.R;
import com.technard.bookacab.base.BaseActivity;
import com.technard.bookacab.ui.fragment.FragmentBasic;

public class ActivityBasic extends BaseActivity {

    private Toolbar tb;
    private FrameLayout fl;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        init();
        attachFragment();
    }

    private void init() {
        tb = findViewById(R.id.tb_basic);
        fl = findViewById(R.id.fl_basic);

        initToolbar();
    }

    private void initToolbar() {
        tb.setTitle("Basic Screen");
        setSupportActionBar(tb);
    }

    private void attachFragment() {
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        FragmentBasic frag = new FragmentBasic();
        android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fl_basic, frag).addToBackStack("basic").commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_basic, menu);
        return true;
    }
}
