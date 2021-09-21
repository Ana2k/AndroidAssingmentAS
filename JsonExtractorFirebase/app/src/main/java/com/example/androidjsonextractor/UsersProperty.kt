package com.example.androidjsonextractor

import android.provider.ContactsContract
import com.fasterxml.jackson.annotation.JsonProperty

// Use @SerializedName(" ") for the Gson converter
// @field:Json(name = " ") for the Moshi converter
// @SerialName(" ") for the Kotlinx Serialization converter
// @JsonProperty(" ") for the Jackson converter

data class UsersProperty(
       var data: List<Data>?

)

data class Data(
    //id, name, username,email,address, phone, website,company
    @JsonProperty("id")
    val userId: String?,

    val name: String?,

    @JsonProperty("username")
    val userName: String?,


    val email: String?,
    val address: Address?,
    //street,suite,city,zipcode, geo
    //geo>>lat,lng

    val phone: String?,
    val website: String?,
    val company: String?
)

data class Address(
    val street: String?,
    val suite: String?,
    val city: String?,

    @JsonProperty("zipcode")
    val zipCode: String?,
    val geo: Geo?
)

data class Geo(
    val lat: Int?,
    val lng: Int?
)
