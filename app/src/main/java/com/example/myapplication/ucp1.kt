package com.example.myapplication

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Preview(showBackground = true)
@Composable
fun PlayActivity(modifier: Modifier = Modifier){
    Column (modifier = Modifier.fillMaxSize()){
        HeaderSection()
        Text(text = "Plant Your Adventure,",
            modifier = Modifier.padding(16.dp))
        Text(text = "Let's Plan an exquisite adventure",
            modifier = Modifier.padding(start = 16.dp))
        Spacer(modifier = Modifier.size(50.dp))

    }
}
@Composable
fun HeaderSection(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Blue)
        .padding(15.dp)){
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.pati),
                    contentDescription = "",
                    modifier = Modifier
                        .size(75.dp)
                        .clip(CircleShape)
                )
                Text(text = "Yogi Dewanto",
                    color = Color.White
                )
                Text(text = "Kabupaten Bantul",
                    color = Color.White
                )
            }
            Box(
                contentAlignment = Alignment.BottomStart
            ){

            }
        }
    }
}
@Composable
fun BiodataForm(){
    var origin by remember { mutableStateOf("") }
    var departure by remember { mutableStateOf("") }
    var arrival by remember { mutableStateOf("") }
    var Kendaraan = listOf("bus", "Ship", "Train","Plane")

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            value = origin,
            onValueChange = {origin = it},
            label = { Text("Lokasi") },
            placeholder = {Text("Masukkan Lokasi Anda")}
        )
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            value = departure,
            onValueChange = {departure = it},
            label = { Text("Keberangkatan") },
            placeholder = {Text("Masukkan tanggal berangkat anda")}
        )
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            value = arrival,
            onValueChange = {arrival = it},
            label = { Text("Pulang") },
            placeholder = {Text("Masukkan Kapan Anda pulang")}
        )
        }
    }
}