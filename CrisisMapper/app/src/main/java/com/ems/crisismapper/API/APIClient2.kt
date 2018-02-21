package com.ems.crisismapper.API

import com.google.gson.Gson
import com.google.gson.GsonBuilder

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory


/**
 * Created by aldmar on 16/02/2018.
 */

class APIClient2 {
    val apiService: APIService2


    init {
        val gson = GsonBuilder().setLenient().create()
        val httpClient = OkHttpClient.Builder().build()
        apiService = Retrofit.Builder()
                .client(httpClient)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("http://192.168.99.1:3000")
                .build()
                .create(APIService2::class.java)
    }
}
