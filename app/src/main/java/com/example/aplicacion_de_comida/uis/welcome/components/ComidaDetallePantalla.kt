package com.example.aplicacion_de_comida.uis.welcome.components

import androidx.compose.foundation.Image
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.aplicacion_de_comida.domain.models.Comida

@Composable
fun ComidaDetallePantalla(comida: Comida?){
    Text(text = " ${comida!!.title}")
    Text(text = " ${comida!!.price}")

}