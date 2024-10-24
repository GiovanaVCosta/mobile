package br.senai.sp.jandira.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.myapplication.screens.SituacaoPagamento
import br.senai.sp.jandira.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                val  navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "SituacaoPagamento"
                ){
                    composable(route = "SituacaoDePagamento") { SituacaoPagamento(navController) }

                }
            }
        }
    }
}







