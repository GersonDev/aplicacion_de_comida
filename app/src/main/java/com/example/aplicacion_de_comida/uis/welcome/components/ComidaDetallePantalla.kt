package com.example.aplicacion_de_comida.uis.welcome.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.aplicacion_de_comida.domain.models.Comida
import com.example.aplicacion_de_comida.domain.models.Descripcion

@Composable
fun ComidaDetallePantalla(comida: Comida?,descripcion: Descripcion?) {
    Box {
        Column() {
            Text(text = " ${comida!!.title}")
            Text(text = " ${comida!!.price}")
            Text(text = "${descripcion!!.title}")
            Text(text = "${descripcion!!.description}")
            Text(text = "${descripcion!!.localtionDescription}")
            Text(text = "${descripcion!!.timeDescription}")
            Text(text = "${descripcion!!.location}")
            Text(text = "${descripcion!!.title}")
        }
    }


}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun DescritionComida(descripcion: Descripcion) {
    Box {
        Column() {
            Text(
                text = descripcion.title
            )
            Text(
                text = descripcion.description
            )
            Row() {
                Column() {
                    Image(painter = painterResource(id = descripcion.imageLocation) , contentDescription ="ubicacion" )
                    Image(painter = painterResource(id = descripcion.imgeDelivery) , contentDescription ="time" )
                }
                Column() {
                    Text(text = descripcion.location)
                    Text(text = descripcion.localtionDescription)
                    Text(text = descripcion.time)
                    Text(text = descripcion.timeDescription)
                }
            }
        }
    }

}