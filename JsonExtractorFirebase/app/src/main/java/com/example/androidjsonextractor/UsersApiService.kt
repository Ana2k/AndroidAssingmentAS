package com.example.androidjsonextractor

import com.example.androidjsonextractor.model.UsersProperty

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    interface UsersApiService{
        @GET("users")
        //this adds to back of BASE_URL
        suspend fun getAllUsers(): List<UsersProperty>

        //mars real estate app you remember we use only REsponse why?
        //When the data class model structure is non changing.
        //json uses Response
    }//expensive call so create an object
    object UsersApi{
        val retrofitService: UsersApiService by lazy {
            retrofit.create(UsersApiService::class.java)
        }
    }

//https://tutorialwing.com/retrofit-library-with-recyclerview-in-kotlin-example/
//EXACTLY AN APP LIKE THIS WAS NEEDED...slowly from the base then builded up...
