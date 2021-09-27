package com.example.androidjsonextractor.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Company(
    @JsonProperty("name")
    val companyName: String?,
    @JsonProperty("catchPhrase")
    val companyCatchPhrase: String?,
    @JsonProperty("bs")
    val companyBs: String?
)
//"name": "Romaguera-Crona",
//      "catchPhrase": "Multi-layered client-server neural-net",
//      "bs": "harness real-time e-markets"