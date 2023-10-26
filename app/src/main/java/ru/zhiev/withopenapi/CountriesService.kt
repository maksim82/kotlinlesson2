package ru.zhiev.withopenapi

import retrofit2.http.GET
import ru.zhiev.withopenapi.data.CountriesModel

interface CountriesService {
    @GET("/v3.1/region/europe")
    suspend fun getCountries(): List<CountriesModel>
}