package com.example.androidjsonextractor

import android.provider.ContactsContract
import com.example.androidjsonextractor.model.Address
import com.example.androidjsonextractor.model.Company
import com.example.androidjsonextractor.model.Data
import com.example.androidjsonextractor.model.Geo
import com.fasterxml.jackson.annotation.JsonProperty

// Use @SerializedName(" ") for the Gson converter
// @field:Json(name = " ") for the Moshi converter
// @SerialName(" ") for the Kotlinx Serialization converter
// @JsonProperty(" ") for the Jackson converter

data class UsersProperty(
    var data: List<Data>?,
    var text1: String?,//empty data
    var text2: String?//empty data
)

