package com.ems.crisismapper.API

import com.ems.crisismapper.POJO.Model
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

/**
 * Created by aldmar on 16/02/2018.
 */

    interface TwitterAPIService {

    @GET("api.php")
    fun getTweets(@Query("action") action: String,
                      @Query("format") format: String,
                      @Query("list") list: String,
                      @Query("srsearch") srsearch: String): Observable<Model.Result>

    companion object {
        fun create(): TwitterAPIService {

            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://en.wikipedia.org/w/")
                    .build()

            return retrofit.create(TwitterAPIService::class.java)
        }
    }

    }
