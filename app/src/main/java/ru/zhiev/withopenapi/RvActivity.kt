package ru.zhiev.withopenapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.zhiev.withopenapi.viewModel.CountriesViewModel

class RvActivity : AppCompatActivity() {

    private val countriesViewModel: CountriesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv)

        countriesViewModel.fetchCountries()
        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewAPI)

        countriesViewModel.countriesData.observe(this) { data ->
            val adapter = RvAdapter(data)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(this@RvActivity)
        }
    }
}