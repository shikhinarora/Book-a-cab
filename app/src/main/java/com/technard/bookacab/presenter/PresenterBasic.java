package com.technard.bookacab.presenter;

import com.technard.bookacab.base.BasePresenter;
import com.technard.bookacab.base.BasePresenterApiCall;
import com.technard.bookacab.view.IBasicFrag;

public class PresenterBasic extends BasePresenter implements BasePresenterApiCall {

    private IBasicFrag view;

    public PresenterBasic(IBasicFrag view){
        this.view = view;
    }

    public void modifyTextAndUpdate(String text){
        String updatedText = text.toUpperCase();
        view.updateText(updatedText);
    }

    public void fetchDataFromWikipedia(String query){
        view.showProgress();
    }

    public void resetView(IBasicFrag view){
        this.view = view;
    }

    public void destroy(){
        this.view = null;
    }

    @Override
    public void onSuccess(Object data) {
        view.hideProgress();
    }

    @Override
    public void onFailure(Object data) {
        view.hideProgress();
        String error = (String) data;
        view.updateText(error);
    }
}
