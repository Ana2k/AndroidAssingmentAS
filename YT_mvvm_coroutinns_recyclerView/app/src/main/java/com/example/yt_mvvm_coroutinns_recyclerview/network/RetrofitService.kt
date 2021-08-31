package com.example.yt_mvvm_coroutinns_recyclerview.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    companion object{
        val baseURL = "https://api.github.com/search"
        fun getRetrofitInstance(): Retrofit{
            return Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}