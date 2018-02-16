package com.ems.crisismapper.API

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

/**
 * Created by aldma on 16/02/2018.
 */
class Client {
    private var apiService: APIService = null

    fun APIClient(): ??? {
        val gson = GsonBuilder().setLenient().create()
        val httpClient = OkHttpClient.Builder().build()
        apiService = Retrofit.Builder()
                .client(httpClient)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://localhost:3000")
                .build()
                .create(APIService::class.java)

    }

    fun getApiService(): APIService {
        return apiService
    }

}