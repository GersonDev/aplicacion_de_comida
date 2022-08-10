package com.example.aplicacion_de_comida.domain.models

import androidx.annotation.DrawableRes

data class Comida(
    val title:String,
    val price:String,
    val favotiro:Boolean,
    @DrawableRes val image:Int
    )