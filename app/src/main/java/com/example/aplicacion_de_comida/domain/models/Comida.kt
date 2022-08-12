package com.example.aplicacion_de_comida.domain.models

import androidx.annotation.DrawableRes

data class Comida(
    val title: String,
    val price: String,
    val favotiro: Boolean,
    @DrawableRes val image: Int,
    val descripcion: Descripcion
)

data class Descripcion(
    val title: String,
    val description: String,
    val reciboItems: List<ReciboItem>
)

data class ReciboItem(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

data class Opcion(
    @DrawableRes val image: Int,
)