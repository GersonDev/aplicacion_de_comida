package com.example.aplicacion_de_comida.uis.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun botonVerde(){
    Row(
        Modifier
            .background(Color.Green)
    ) {
        Text(
            text = "2 Items",
            color = Color.White,
            style = MaterialTheme.typography.caption
        )
        Spacer(
            modifier = Modifier
                .weight(1f)
        )
        Text(
            text = " $ 27.OO",
            color = Color.White,
            style = MaterialTheme.typography.h5
        )
    }
}