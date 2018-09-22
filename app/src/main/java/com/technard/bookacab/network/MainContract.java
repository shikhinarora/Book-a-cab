package com.technard.bookacab.network;

import com.technard.bookacab.network.contract.base.BaseContractPresenter;
import com.technard.bookacab.network.contract.base.BaseContractView;
import com.technard.bookacab.pojo.model.Notice;

import java.util.ArrayList;

/**
 * Created by bpn on 12/6/17.
 */

public interface MainContract {

    /**
     * Call when user interact with the view and other when view OnDestroy()
     * */
    interface presenter extends BaseContractPresenter {

        void onRefreshButtonClick();

        void requestDataFromServer();

    }

    /**
     * showProgress() and hideProgress() would be used for displaying and hiding the progressBar
     * while the setDataToRecyclerView and onResponseFailure is fetched from the GetNoticeInteractorImpl class
     **/
    interface MainView extends BaseContractView {

        void setDataToRecyclerView(ArrayList<Notice> noticeArrayList);

        void onResponseFailure(Throwable throwable);

    }

    /**
     * Intractors are classes built for fetching data from your database, web services, or any other data source.
     **/
    interface GetNoticeIntractor {

        interface OnFinishedListener {
            void onFinished(ArrayList<Notice> noticeArrayList);
            void onFailure(Throwable t);
        }

        void getNoticeArrayList(OnFinishedListener onFinishedListener);
    }
}