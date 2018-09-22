package com.technard.bookacab.network.intractor;

public class GetNoticeIntractorImpl implements MainContract.GetNoticeIntractor {

    @Override
    public void getNoticeArrayList(final OnFinishedListener onFinishedListener) {


        /** Create handle for the RetrofitInstance interface*/
        GetNoticeDataService service = RetrofitInstance.getRetrofitInstance().create(GetNoticeDataService.class);

        /** Call the method with parameter in the interface to get the notice data*/
        Call<NoticeList> call = service.getNoticeData();

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<NoticeList>() {
            @Override
            public void onResponse(Call<NoticeList> call, Response<NoticeList> response) {
                onFinishedListener.onFinished(response.body().getNoticeArrayList());

            }

            @Override
            public void onFailure(Call<NoticeList> call, Throwable t) {
                onFinishedListener.onFailure(t);
            }
        });

    }

}
