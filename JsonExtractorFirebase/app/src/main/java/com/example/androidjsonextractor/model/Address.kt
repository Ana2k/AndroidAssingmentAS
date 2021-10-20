package com.example.androidjsonextractor.model

import com.example.androidjsonextractor.model.Geo

data class Address(
    val street: String?,
    val suite: String?,
    val city: String?,

    val zipcode: String?,
    val geo: Geo?
)