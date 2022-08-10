package com.example.aplicacion_de_comida.uis.welcome.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplicacion_de_comida.R
import com.example.aplicacion_de_comida.domain.models.Comida

@Composable
fun ComidasPantalla(comidas: List<Comida>, onClickComida: (Comida) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                colorResource(R.color.fondo)
            )
    ) {
        Spacer(modifier = Modifier
            .height(70.dp))
        Column {
            Text(
                text = "Work Place",
                color = Color.DarkGray,
                fontWeight = FontWeight.Medium,
                style = MaterialTheme.typography.h1,
            )
            Text(
                text = "choose your delicius meal",
                color = Color.DarkGray,
                fontWeight = FontWeight.Light
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
            )
            {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
                    content = {
                        Image(
                            painter = painterResource(id = R.drawable.icono_house),
                            contentDescription = "Icono"
                        )
                    }
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
                    content = {
                        Image(
                            painter = painterResource(id = R.drawable.icono_corazon),
                            contentDescription = "Icono"
                        )
                    }
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
                    content = {
                        Image(
                            painter = painterResource(id = R.drawable.icono_filtro),
                            contentDescription = "Icono"
                        )

                    }
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
                    content = {
                        Image(
                            painter = painterResource(id = R.drawable.icono_carrito),
                            contentDescription = "Icono"
                        )
                    }
                )
//                Spacer(modifier = Modifier
//                    .height(10.dp))
            }
        }
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
            .height(300.dp)
            .padding(10.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.fondo)),
            shape = RoundedCornerShape(15.dp),
            onClick = {
                onClickComida(comida)
            }
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(colorResource(id = R.color.fondo)),
            ) {
                Column() {
                    Image(
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp),
                        painter = painterResource(id = comida.image),
                        contentDescription = "Imagen de comida",
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.padding(bottom = 30.dp))
                    Text(
                        text = comida.title,
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = comida.price,
                        color = colorResource(id = R.color.verdes_precio),
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                }

            }
        }
    }
}
