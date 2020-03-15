package com.welson.kaiyan.api;

import com.welson.kaiyan.model.BaseData;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {


    @GET("/v7/index/tab/discovery")
    Observable<BaseData> getFoundMore();

    @GET("/v5/index/tab/allRec")
    Observable<BaseData> getDailyRecommend();

    @GET("/v5/index/tab/feed")
    Observable<BaseData> getDailyChoice();

}
