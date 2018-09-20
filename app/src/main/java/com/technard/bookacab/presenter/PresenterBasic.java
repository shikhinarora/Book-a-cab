package com.technard.bookacab.presenter;

import com.technard.bookacab.base.BasePresenter;
import com.technard.bookacab.view.IBasicFrag;

public class PresenterBasic extends BasePresenter {

    private IBasicFrag view;

    public PresenterBasic(IBasicFrag view){
        this.view = view;
    }

    public void modifyTextAndUpdate(String text){
        String updatedText = text.toUpperCase();
        view.updateText(updatedText);
    }

    public void resetView(IBasicFrag view){
        this.view = view;
    }

    public void destroy(){
        this.view = null;
    }
}
