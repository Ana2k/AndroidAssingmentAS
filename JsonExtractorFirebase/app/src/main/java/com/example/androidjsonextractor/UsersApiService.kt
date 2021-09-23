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

        //noted down this from using majorly two blogs
        //https://johncodeos.com/how-to-parse-json-with-retrofit-converters-using-kotlin/
        //and https://tutorials.eu/json-parsing-and-how-to-use-gson-in-android/#ftoc-heading-17

    }



}