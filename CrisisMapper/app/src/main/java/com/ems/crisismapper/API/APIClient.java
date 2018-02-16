package com.ems.crisismapper.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.jetbrains.annotations.NotNull;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;


/**
 * Created by aldmar on 16/02/2018.
 */

public class APIClient {
    private APIService apiService;

    public APIClient(){
        Gson gson = new GsonBuilder().setLenient().create();
        OkHttpClient httpClient = new OkHttpClient.Builder().build();
        apiService = new Retrofit.Builder()
                .client(httpClient)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://localhost:3000")
                .build()
                .create(APIService.class);

    }

    public APIService getApiService() {
        return apiService;
    }

    @NotNull
    public Object getTweets() {
        return null;
    }
}
