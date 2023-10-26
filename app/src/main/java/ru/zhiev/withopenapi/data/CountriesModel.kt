package ru.zhiev.withopenapi.data

import com.google.gson.annotations.SerializedName

data class CountriesModel(
    @SerializedName("name")
    val name: NameInfo
)

data class NameInfo(
    val common: String,
    val official: String
)

