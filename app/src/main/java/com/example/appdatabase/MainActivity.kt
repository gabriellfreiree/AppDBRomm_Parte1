package com.example.appdatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appdatabase.ui.theme.AppDataBaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(){
    var nome by remember {
        mutableStateOf("")
    }
    var telefone by remember {
        mutableStateOf("")
    }
    Column (
        Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .fillMaxHeight()
    ){
        Row (
            Modifier
                .padding(20.dp)
        ){

        }
        Row (
            Modifier
                .fillMaxWidth(),
            Center
        ){
            Text(
                text = "App Database",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp)
        }
    }
    Row (
        Modifier
            .padding(20.dp)
    ){

    }
    Row (
        Modifier
            .fillMaxWidth(),
        Center
    ){
        TextField(
            value = nome,
            onValueChange = {nome = it},
            label = { Text(text = "Nome: ")}
        )
    }
    Row (
        Modifier
            .padding(20.dp)
    ){

    }
    Row (
        Modifier
            .fillMaxWidth(),
        Arrangement.Center
    ){
        TextField(
            value = telefone,
            onValueChange = {telefone = it},
            label = { Text(text = "Telefone: ")})
    }
    Row (
        Modifier
            .padding(20.dp)
    ){

    }
    Row (
        Modifier
            .fillMaxWidth(),
        Arrangement.Center
    ){
        Button(onClick = {


        }) {
            Text(text = "Cadastrar: " )
        }
    }
    Row (
        Modifier
            .padding(20.dp)
    ){

    }
}
@Preview
@Composable
fun AppPreview() {
    AppDataBaseTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            App()
        }
    }
}