package com.example.aplicacion_de_comida.uis.welcome

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.aplicacion_de_comida.R
import com.example.aplicacion_de_comida.domain.models.Comida
import com.example.aplicacion_de_comida.domain.models.Descripcion
import com.example.aplicacion_de_comida.domain.models.Opcion
import com.example.aplicacion_de_comida.domain.models.ReciboItem
import com.example.aplicacion_de_comida.routes.WelcomeScreen

class WelcomeViewModel(application: Application) : AndroidViewModel(application) {
    private val _opcions = MutableLiveData<List<Opcion>>(
        listOf(
            Opcion(
                image = R.drawable.ic_icono_casa
            ),
            Opcion(
                image = R.drawable.ic_icono_corazon
            ),
            Opcion(
                image = R.drawable.ic_icono_filtro
            ),
            Opcion(
                image = R.drawable.ic_icono_carrito
            ),
        )
    )
    val opcions :LiveData<List<Opcion>> = _opcions


    private val _comidas = MutableLiveData<List<Comida>>(
        listOf(
            Comida(
                title = "Veg Salad",
                price = "$11.00",
                favotiro = true,
                R.drawable.image_ensalada,
                descripcion = Descripcion(
                    title = "Receta",
                    description = "Prepara el aderezo con el vinagre, el aceite y la Salsa Soya MAGGI®." +
                            "Acomoda las papas con los demás ingredientes(zanahoria, jamón, ejotes,chícharos )en un plato." +
                            "Baña con el aderezo y agrega los cuadritos de jamón.",
                    reciboItems = listOf(
                        ReciboItem(
                            title = "Location",
                            description = "lorem ipsum dolor sit",
                            image = R.drawable.icono_location
                        ),
                        ReciboItem(
                            title = "Delivery Time",
                            description = "5 minutes",
                            image = R.drawable.icono_time
                        )
                    )
                )
            ),
            Comida(
                title = "Roasted Chicken",
                price = "$13.00",
                favotiro = true,
                R.drawable.image_pollo,
                descripcion = Descripcion(
                    title = "Receta",
                    description = "Place chicken in a roasting pan, and season generously inside and " +
                            "out with salt and pepper. Sprinkle inside and out with onion powder." +
                            " Arrange dollops of the remaining margarine around the chicken's exterior." ,
                    reciboItems = listOf(
                        ReciboItem(
                            title = "Location",
                            description = "lorem ipsum dolor sit",
                            image = R.drawable.icono_location
                        ),
                        ReciboItem(
                            title = "Delivery Time",
                            description = "6 minutes",
                            image = R.drawable.icono_time
                        )
                    )
                )
            ),
            Comida(
                title = "Rice & Stew",
                price = "$15.00",
                favotiro = true,
                R.drawable.image_carnearroz,
                descripcion = Descripcion(
                    title = "Receta",
                    description = "The first thing we're going to do is chop the onion, garlic, green pepper and potatoe. " +
                            "And with a table spoon of olive oil we are going to take the onion, garlic, green pepper and " +
                            "potatoe the hot pan. Cook slow until the onion softens and is clear",
                    reciboItems = listOf(
                        ReciboItem(
                            title = "Location",
                            description = "lorem ipsum dolor sit",
                            image = R.drawable.icono_location
                        ),
                        ReciboItem(
                            title = "Delivery Time",
                            description = "16 minutes",
                            image = R.drawable.icono_time
                        )
                    )
                )
            ),
            Comida(
                title = "Steak",
                price = "$33.00",
                favotiro = true,
                R.drawable.image_carne,
                descripcion = Descripcion(
                    title = "Receta",
                    description = "Cuando la carne esté a temperatura ambiente, frota aceite de oliva " +
                            "en el bistec, tanto por delante como por detrás." +
                            "Salpimentamos cada pedazo de carne por ambos lados, unos 15 minutos antes de cocinarlos.",
                    reciboItems = listOf(
                        ReciboItem(
                            title = "Location",
                            description = "lorem ipsum dolor sit",
                            image = R.drawable.icono_location
                        ),
                        ReciboItem(
                            title = "Delivery Time",
                            description = "60 minutes",
                            image = R.drawable.icono_time
                        )
                    )
                )
            )
        )
    )
    val comidas: LiveData<List<Comida>> = _comidas

    private val _comidaSeleccionada = MutableLiveData<Comida>()
    val comidaSeleccionada: LiveData<Comida> = _comidaSeleccionada


    fun enviarComidasSeleccionas(comida: Comida) {
        _comidaSeleccionada.value = comida
    }


}