package com.example.aplicacion_de_comida.uis.welcome.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.aplicacion_de_comida.R
import com.example.aplicacion_de_comida.ui.theme.Poppins

@Composable
fun WelcomePantalla(onClickIngresar: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(color = Color(0xD73FC979))
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .height(
                        197.dp
                    )
                    .width(
                        185.dp
                    ),
                painter = painterResource(id = R.drawable.plato_welcome),
                contentDescription = "plato de la pantalla principal"
            )
            Spacer(modifier = Modifier.padding(bottom = 10.dp))
            Text(
                text = stringResource(
                    id = R.string.food_ordering_app
                ),
                color = Color.White,
                fontFamily = Poppins,
                style = MaterialTheme.typography.h1,
                modifier = Modifier.padding(bottom = 35.dp),
                textAlign = TextAlign.Center
            )
            Button(

                onClick = onClickIngresar,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xD7FFFFFF)),
                shape = RoundedCornerShape(22.dp),
                modifier = Modifier
                    .width(315.dp)
                    .height(51.dp),
                content = {
                    Text(
                        text = stringResource(id = R.string.get_a_meal),
                        fontFamily = Poppins,
                        style = MaterialTheme.typography.button
                    )
                }
            )
        }
    }
}
//@Preview
//@Composable
//private fun WelcomepantallaPreview() {
//    Aplicacion_de_comidaTheme {
//        WelcomePantalla(onClickIngresar = {})
//    }
//}