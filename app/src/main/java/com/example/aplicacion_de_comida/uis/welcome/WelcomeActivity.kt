package com.example.aplicacion_de_comida.uis.welcome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.rememberNavController
import com.example.aplicacion_de_comida.ui.theme.Aplicacion_de_comidaTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.aplicacion_de_comida.routes.WelcomeScreen
import com.example.aplicacion_de_comida.uis.welcome.components.ComidasPantalla
import com.example.aplicacion_de_comida.uis.welcome.components.WelcomePantalla

class WelcomeActivity : ComponentActivity() {

    private val welcomeViewModel by viewModels<WelcomeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aplicacion_de_comidaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreem(
                        welcomeViewModel
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreem(
    welcomeActivity: WelcomeViewModel
) {
    val context = LocalContext.current
    val navController = rememberNavController()
    NavHost(navController, startDestination = WelcomeScreen.Bienvenida.route) {
        composable(WelcomeScreen.Bienvenida.route) {
            WelcomePantalla(
                onClickIngresar = {
                    navController.navigate(WelcomeScreen.Comidas.route)
                }
            )
        }
        composable(WelcomeScreen.Comidas.route){
            ComidasPantalla(comidas = , onClickComida = )
        }
    }
}