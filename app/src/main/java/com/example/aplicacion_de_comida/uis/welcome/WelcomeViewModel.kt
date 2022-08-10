package com.example.aplicacion_de_comida.uis.welcome

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.aplicacion_de_comida.R
import com.example.aplicacion_de_comida.domain.models.Comida
import com.example.aplicacion_de_comida.routes.WelcomeScreen

class WelcomeViewModel(application: Application) : AndroidViewModel(application) {

    private val _comidas =MutableLiveData<List<Comida>>(
        listOf(
            Comida(title = "Veg Salad", price = "$10.00", favotiro = true, R.drawable.veg_salad),
              Comida(title = "Rice Stew", price = "$10.00", favotiro = true, R.drawable.rice_stew),
               Comida(title = "Roasted chiken", price = "$10.00", favotiro = true, R.drawable.roasted_chiken),
                Comida(title = "Steak", price = "$10.00", favotiro = true, R.drawable.steak)
            )
        )
    val comidas: LiveData<List<Comida>> = _comidas


}