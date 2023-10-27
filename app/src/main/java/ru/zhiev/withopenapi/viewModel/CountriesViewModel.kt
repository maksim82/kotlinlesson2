package ru.zhiev.withopenapi.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.zhiev.withopenapi.data.CountriesAPIRetrofit
import ru.zhiev.withopenapi.data.CountriesModel


class CountriesViewModel : ViewModel() {
    val countriesData = MutableLiveData<List<CountriesModel>>()

    fun fetchCountries() {
        viewModelScope.launch {
            val countries = CountriesAPIRetrofit.countriesService.getCountries()
            countriesData.postValue(countries)
        }
    }
}