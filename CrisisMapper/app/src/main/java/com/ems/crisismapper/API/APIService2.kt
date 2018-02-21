package com.ems.crisismapper.API

import com.ems.crisismapper.POJO.Tweet
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by aldmar on 21/02/2018.
 */
public interface APIService2 {
    @GET("/tweets")
    fun getTweets(): Call<List<Tweet>>
}