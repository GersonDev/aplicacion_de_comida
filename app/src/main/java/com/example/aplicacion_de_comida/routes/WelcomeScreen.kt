package com.example.aplicacion_de_comida.routes

sealed class WelcomeScreen(val route:String) {
    object Bienvenida: WelcomeScreen("BienvenidaPantalla")
    object Comidas: WelcomeScreen("ComidasPantalla")
}

