package com.technard.bookacab.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.technard.bookacab.R;
import com.technard.bookacab.base.BaseFragment;
import com.technard.bookacab.presenter.PresenterBasic;
import com.technard.bookacab.view.IBasicFrag;

public class FragmentBasic extends BaseFragment implements IBasicFrag{

    private View view = null;
    private TextView tv1;
    private EditText et;
    private Button bUpdate;

    private PresenterBasic presenter = null;
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_basic, container, false);
        init();
        return view;
    }

    private void init() {

        initPresenter();

        tv1 = (TextView) view.findViewById(R.id.tv_frag_basic_1);
        et = view.findViewById(R.id.et_frag_basic);
        bUpdate = view.findViewById(R.id.b_frag_basic_update);

        bUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userText = et.getText().toString();
                presenter.modifyTextAndUpdate(userText);
            }
        });
    }

    private void initPresenter() {
        if(presenter == null)
            presenter = new PresenterBasic(this);
    }

    @Override
    public void updateText(String text) {
        tv1.setText(text);
    }
}
