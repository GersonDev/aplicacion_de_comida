package com.example.aplicacion_de_comida.uis.welcome.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aplicacion_de_comida.R
import com.example.aplicacion_de_comida.domain.models.Comida

@Composable
fun ComidasPantalla(comidas: List<Comida>, onClickComida: (Comida) -> Unit) {
    Column(
        modifier = Modifier
            .background(colorResource(R.color.fondo))
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {
            items(
                items = comidas,
                itemContent = { comida ->
                    ComidasCard(comida = comida, onClickComida = onClickComida)
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun ComidasCard(comida: Comida, onClickComida: (Comida) -> Unit) {
    Row(
        modifier = Modifier
            .width(148.dp)
            .height(226.dp)
            .padding(20.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize(),
            shape = RoundedCornerShape(15.dp),
            onClick = {
                onClickComida(comida)
            }
        ) {
            Box(
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    painter = painterResource(id = comida.image),
                    contentDescription = "Imagen de comida",
                    contentScale = ContentScale.FillBounds
                )
                Text(
                    text = comida.title,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(10.dp),
                )
            }
        }
    }
}

@Preview
@Composable
private fun ComidasPantallaPreview() {
    ComidasPantalla(
        listOf(
            Comida("hola", "hola", R.drawable.veg_salad)
        ),
        onClickComida = {
        }
    )
}