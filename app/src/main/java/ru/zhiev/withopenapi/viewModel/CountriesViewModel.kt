package ru.zhiev.withopenapi.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.zhiev.withopenapi.data.CountriesAPIRetrofit


class CountriesViewModel : ViewModel() {
    val countriesData = MutableLiveData<List<String>>()

    fun fetchCountries() {
        viewModelScope.launch {
            val countries = CountriesAPIRetrofit.countriesService.getCountries()
                .map {
                    "${it.name.common}:::${it.flags.png}"
                }
            countriesData.postValue(countries)
        }
    }
}