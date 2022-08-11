package com.example.aplicacion_de_comida.uis.welcome

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.aplicacion_de_comida.R
import com.example.aplicacion_de_comida.domain.models.Comida
import com.example.aplicacion_de_comida.domain.models.Descripcion
import com.example.aplicacion_de_comida.routes.WelcomeScreen

class WelcomeViewModel(application: Application) : AndroidViewModel(application) {

    private val _comidas = MutableLiveData<List<Comida>>(
        listOf(
            Comida(title = "Veg Salad", price = "$11.00", favotiro = true, R.drawable.veg_salad),
            Comida(title = "Rice Stew", price = "$12.00", favotiro = true, R.drawable.rice_stew),
            Comida(title = "Roasted chiken", price = "$10.00", favotiro = true, R.drawable.roasted_chiken),
            Comida(title = "Steak", price = "$10.00", favotiro = true, R.drawable.steak)
        )
    )
    val comidas: LiveData<List<Comida>> = _comidas

    private val _comidaSeleccionada = MutableLiveData<Comida>()
    val comidaSeleccionada: LiveData<Comida> = _comidaSeleccionada


    fun enviarComidasSeleccionas(comida: Comida) {
        _comidaSeleccionada.value = comida
    }

    private val _description = MutableLiveData<List<Descripcion>>(
        listOf(
            Descripcion(
                title = "Receta",
                description = "Veg SaladVeg SaladVeg SaladVeg SaladVeg SaladVeg SaladVeg Salad",
                location = "Location",
                localtionDescription = "lorem ipsum dolor sit",
                time = "Delivery Time",
                timeDescription = "5 Minutos",
                R.drawable.icono_location,
                R.drawable.icono_time
            ),
            Descripcion(
                title = "Receta",
                description = "Veg SaladVeg SaladVeg SaladVeg SaladVeg SaladVeg SaladVeg Salad",
                location = "Location",
                localtionDescription = "lorem ipsum dolor sit",
                time = "Delivery Time",
                timeDescription = "5 Minutos",
                R.drawable.icono_location,
                R.drawable.icono_time
            ),
            Descripcion(
                title = "Receta",
                description = "Veg SaladVeg SaladVeg SaladVeg SaladVeg SaladVeg SaladVeg Salad",
                location = "Location",
                localtionDescription = "lorem ipsum dolor sit",
                time = "Delivery Time",
                timeDescription = "5 Minutos",
                R.drawable.icono_location,
                R.drawable.icono_time
            ),
            Descripcion(
                title = "Receta",
                description = "Veg SaladVeg SaladVeg SaladVeg SaladVeg SaladVeg SaladVeg Salad",
                location = "Location",
                localtionDescription = "lorem ipsum dolor sit",
                time = "Delivery Time",
                timeDescription = "5 Minutos",
                R.drawable.icono_location,
                R.drawable.icono_time
            )

        )
    )

}