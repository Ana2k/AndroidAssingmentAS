package com.example.androidjsonextractor.model

import com.example.androidjsonextractor.model.Geo
import com.fasterxml.jackson.annotation.JsonProperty

data class Address(
    val street: String?,
    val suite: String?,
    val city: String?,

    @JsonProperty("zipcode")
    val zipCode: String?,
    val geo: Geo?
)