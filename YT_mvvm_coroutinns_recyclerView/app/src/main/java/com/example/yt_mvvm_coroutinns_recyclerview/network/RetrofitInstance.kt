package com.example.yt_mvvm_coroutinns_recyclerview.network

import com.example.yt_mvvm_coroutinns_recyclerview.models.RecyclerList
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInstance {

    @GET("value:repositories")
    suspend fun getDataFromApi(@Query ("q") query: String): RecyclerList
}