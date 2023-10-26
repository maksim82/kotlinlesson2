package ru.zhiev.withopenapi.data

import retrofit2.http.GET

interface CountriesService {
    @GET("/v3.1/region/europe")
    suspend fun getCountries(): List<CountriesModel>
}