package com.example.androidjsonextractor.model

data class UsersProperty(
    //id, name, username,email,address, phone, website,company
    val id: String?,

    val name: String?,

    val username: String?,

    val email: String?,
    val address: Address?,

    val phone: String?,
    val website: String?,
    val company: Company?,

    val geo: Geo
)