package ru.zhiev.withopenapi.data

import com.google.gson.annotations.SerializedName

data class CountriesModel(
    @SerializedName("name")
    val name: NameInfo,

    @SerializedName("flags")
    val flags: FlagsList
)

data class NameInfo(
    val common: String,
    val official: String
)

data class FlagsList(
    val png: String,
    val svg: String,
    val alt: String
)
