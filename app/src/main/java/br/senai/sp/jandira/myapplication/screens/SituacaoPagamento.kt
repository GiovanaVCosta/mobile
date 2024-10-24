package br.senai.sp.jandira.myapplication.screens

import br.senai.sp.jandira.myapplication.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.myapplication.ui.theme.BalooTammudu
import br.senai.sp.jandira.myapplication.ui.theme.Poppins


@Composable
fun SituacaoPagamento(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xffFFFFFF), // Cor de fundo branca para contraste
    ) {
        Column(
            modifier = Modifier
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Situação dos Pagamentos",
                fontFamily = Poppins,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF000000), // Texto preto para contraste
            )

            Spacer(modifier = Modifier.height(10.dp))

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp, end = 10.dp, bottom = 30.dp)
            ) {
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .height(500.dp)
                            .shadow(10.dp, shape = RoundedCornerShape(20.dp), clip = false)
                            .fillMaxWidth()
                            .background(
                                Brush.linearGradient(
                                    0.0f to Color(0xff03396C),
                                    1.0f to Color(0xff011F4B)
                                ),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(vertical = 20.dp)
                        ) {
                            Card(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(100.dp),
                                shape = CircleShape
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.francisco),
                                    contentDescription = "Imagem de perfil",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxSize()
                                )

                            }

                            Spacer(modifier = Modifier.height(5.dp))

                            Text(
                                text = "FRANCISCO DE ALMEIDA",
                                fontFamily = BalooTammudu,
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF000000),
                                modifier = Modifier.padding(vertical = 2.dp)
                            )

                            Text(
                                text = "Freelancer",
                                fontFamily = BalooTammudu,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0x93939393)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.carteira),
                                    contentDescription = "Ícone de carteira",
                                    modifier = Modifier.size(30.dp)
                                )

                                Spacer(modifier = Modifier.width(8.dp))

                                Text(
                                    text = "R$000,00",
                                    fontFamily = Poppins,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color(0x93939393)
                                )
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            LazyColumn(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp)

                            ) {
                                items(4) {
                                    Card(
                                        modifier = Modifier
                                            .padding(5.dp)
                                            .border(0.5.dp, Color(0x011F4B), RoundedCornerShape(20.dp)),

                                        colors = CardDefaults.cardColors(
                                            containerColor = Color(0xFFFFFFFD)
                                        ),
                                        shape = RoundedCornerShape(20.dp)
                                    ) {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .padding(5.dp),
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.Center
                                        ) {
                                            Text(text = "Nome do Projeto")


                                            Spacer(modifier = Modifier.width(5.dp))

                                            Text(
                                                text = "R$000,00",
                                                fontSize = 14.sp,
                                                fontFamily = Poppins,
                                                fontWeight = FontWeight.Medium,
                                                color = Color(0xFF004d40)

                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}







