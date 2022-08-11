package com.example.aplicacion_de_comida.domain.models

import androidx.annotation.DrawableRes

data class Descripcion(
    val title:String,
    val description:String,
    val location:String,
    val localtionDescription:String,
    val  time:String,
    val  timeDescription:String,
    @DrawableRes val imageLocation:Int,
    @DrawableRes val imgeDelivery:Int
)