package com.example.androidjsonextractor

import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
class UsersApiService{
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(JacksonConverterFactory.create())
        .build()

    interface UsersApiService{
        @GET("users")
        //this adds to back of BASE_URL
        suspend fun getAllUsers(): Response<UsersProperty>

        //mars real estate app you remember we use only REsponse why?
        //When the data class model structure is non changing.
        //json uses Response


    }



}