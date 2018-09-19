package com.technard.bookacab.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.technard.bookacab.R;
import com.technard.bookacab.base.BaseFragment;

public class FragmentBasic extends BaseFragment {

    private View view = null;
    private TextView tv1;
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_basic, container, false);
        init();
        return view;
    }

    private void init() {
        tv1 = (TextView) view.findViewById(R.id.tv_frag_1);
    }
}
