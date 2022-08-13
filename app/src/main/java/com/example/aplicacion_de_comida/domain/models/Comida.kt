package com.example.aplicacion_de_comida.domain.models

import androidx.annotation.DrawableRes

data class Comida(
    val title: String,
    val price: String,
    val favorito: Boolean,
    @DrawableRes val image: Int,
    @DrawableRes val imagenpequeña1:Int,
    @DrawableRes val imagenpequeña2:Int,
    @DrawableRes val imagenpequeña3:Int,
    @DrawableRes val imagenpequeña4:Int,
    val descripcion: Descripcion,
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