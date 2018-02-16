package com.ems.crisismapper.API;


import com.ems.crisismapper.POJO.TwitterPojo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by aldmar on 16/02/2018.
 */

public interface APIService {

    @GET("/tweets")
    Call<List<TwitterPojo>> getTweets();

}

