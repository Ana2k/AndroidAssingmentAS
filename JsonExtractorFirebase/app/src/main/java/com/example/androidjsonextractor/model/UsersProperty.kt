package com.example.androidjsonextractor.model

import com.fasterxml.jackson.annotation.JsonProperty

data class UsersProperty(
    //id, name, username,email,address, phone, website,company
    @JsonProperty("id")
    val userId: String?,

    val name: String?,

    @JsonProperty("username")
    val userName: String?,

    val email: String?,
    val address: Address?,

    val phone: String?,
    val website: String?,
    val company: Company?,

    val geo: Geo
)