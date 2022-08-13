package com.example.aplicacion_de_comida.uis.welcome.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplicacion_de_comida.R
import com.example.aplicacion_de_comida.domain.models.Comida
import com.example.aplicacion_de_comida.domain.models.Descripcion
import com.example.aplicacion_de_comida.uis.common.botonVerde

@Composable
fun ComidaDetallePantalla(
    comida: Comida?,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                colorResource(id = R.color.fondo)
            )
    ) {
        Column {
            Column() {
                Image(
                    painter = painterResource(id = comida!!.image),
                    contentDescription = "Platos",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp),
                    contentScale = ContentScale.FillBounds
                )
            }
            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = " ${comida!!.title}",
                        color = colorResource(id = R.color.plomo_anegrado_80),
                        style = MaterialTheme.typography.h3,
                    )
                    Spacer(
                        modifier = Modifier
                            .weight(1f)
                    )
                    Image(
                        painter = painterResource(id = comida!!.imagenpequeña1),
                        contentDescription = "",
                        modifier = Modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(id = comida!!.imagenpequeña2),
                        contentDescription = ""
                    )
                    Image(
                        painter = painterResource(id = comida!!.imagenpequeña3),
                        contentDescription = ""
                    )
                    Image(
                        painter = painterResource(id = comida!!.imagenpequeña4),
                        contentDescription = ""
                    )

                }
                Text(
                    text = " ${comida!!.price}",
                    color = colorResource(id = R.color.verdes_precio),
                    style = MaterialTheme.typography.h6,
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                DescriptionComida(
                    descripcion = comida!!.descripcion
                )
            }
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun DescriptionComida(descripcion: Descripcion) {
    Column {
        Text(
            text = descripcion.title,
            color = colorResource(id = R.color.plomo_anegrado_80),
            style = MaterialTheme.typography.h5
        )
        Text(
            text = descripcion.description,
            color = colorResource(id = R.color.plomo_anegrado_50),
            style = MaterialTheme.typography.caption
        )
        descripcion.reciboItems.forEach {
            Row() {
                Column {
                    Image(
                        painter = painterResource(id = it.image),
                        contentDescription = "ubicacion"
                    )
                }
                Column() {
                    Text(
                        text = it.title,
                        color = colorResource(id = R.color.plomo_anegrado_80),
                        style = MaterialTheme.typography.h5
                    )
                    Text(
                        text = it.description,
                        color = colorResource(id = R.color.plomo_anegrado_50),
                        style = MaterialTheme.typography.caption
                    )
                }
            }
        }
        botonVerde()
    }
}
