package com.example.aplicacion_de_comida.uis.welcome.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                colorResource(id = R.color.fondo)
            )
            .padding(20.dp)
    ) {
        Column {
            Spacer(
                modifier = Modifier
                    .height(70.dp)
            )
            Column {
                Text(
                    text = "Work Place",
                    color = colorResource(id = R.color.plomo_anegrado_80),
                    style = MaterialTheme.typography.h2,
                )
                Text(
                    text = "choose your delicius meal",
                    color = colorResource(id = R.color.plomo_anegrado_60),
                    style = MaterialTheme.typography.body2,
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
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

}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun ComidasCard(comida: Comida, onClickComida: (Comida) -> Unit) {
    Card(
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp, top = 10.dp),
        border = BorderStroke(
            1.dp, color = colorResource(id = R.color.plomo_bordeado)
        ),
        onClick = {
            onClickComida(comida)
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(colorResource(id = R.color.fondo))
                .padding(15.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_circle),
                    contentDescription = "Circle"
                )
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.icono_corazon),
                    contentDescription = "corazon"
                )
            }
            Image(
                painter = painterResource(id = comida.image),
                modifier = Modifier
                    .clip(CircleShape),
                contentScale = ContentScale.FillBounds,
                contentDescription = "Imagen de comida",
            )
            Text(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(),
                text = comida.title,
                color = colorResource(id = R.color.plomo_anegrado_80),
                style = MaterialTheme.typography.h4,
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = comida.price,
                    color = colorResource(id = R.color.verdes_precio),
                    style = MaterialTheme.typography.h5,
                )
                Spacer(
                    modifier = Modifier
                        .weight(1f)
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_plus_circle),
                    contentDescription = "plus corazon"
                )
            }

        }
    }
}
