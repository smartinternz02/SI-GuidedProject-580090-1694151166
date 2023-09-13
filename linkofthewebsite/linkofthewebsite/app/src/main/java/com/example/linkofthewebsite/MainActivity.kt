package com.example.linkofthewebsite

import android.app.BackgroundServiceStartNotAllowedException
import android.app.WallpaperManager
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.content.Context
import android.graphics.BitmapFactory
import android.media.Image
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                simpleText()
                simpleTextField()
                simpletextpassword()
                google()
                GEG()
                SimpleButton()
                }
            }
        }
    }


@Composable
fun simpleText(){

    Text(text = "          ", modifier = Modifier.padding(16.dp),
        style =  TextStyle.Default
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpleTextField(){

    var text by remember { mutableStateOf("") }
    TextField(value = text , onValueChange = {it -> text = it }, label = { Text(text = "User Name")}  )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpletextpassword(){
    var text by remember { mutableStateOf("") }
    TextField(value = text , onValueChange = {it -> text = it }, label = { Text(text = "Password")}  )
}

@Composable
fun SimpleButton(){
    // in the below line, we are creating
    // variables for URL
    val url = remember {
        mutableStateOf(TextFieldValue())
    }

    // on below line we are creating
    // a variable for a context
    val ctx = LocalContext.current
    val context = LocalContext.current
    Spacer(modifier = Modifier.height(16.dp))
    //login button

    Button(onClick = {
        val urlIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.Amazon.com")
        )
        ctx.startActivity(urlIntent)
    }) {
        // on below line creating a text for our button.
        Text(
            // on below line adding a text ,
            // padding, color and font size.
            text = "To Open Amazon",
            modifier = Modifier.padding(10.dp),

        )
    }

}
@Composable
fun GEG(){
    // in the below line, we are creating
    // variables for URL
    val url = remember {
        mutableStateOf(TextFieldValue())
    }

    // on below line we are creating
    // a variable for a context
    val ctx = LocalContext.current
    val context = LocalContext.current
    Spacer(modifier = Modifier.height(16.dp))
    //login button

    Button(onClick = {
        val urlIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.geeksforgeeks.org/")
        )
        ctx.startActivity(urlIntent)
    }) {
        // on below line creating a text for our button.
        Text(
            // on below line adding a text ,
            // padding, color and font size.
            text = "To Open GeeksforGeeks",
            modifier = Modifier.padding(10.dp),

            )
    }

}
@Composable
fun google(){
    // in the below line, we are creating
    // variables for URL
    val url = remember {
        mutableStateOf(TextFieldValue())
    }

    // on below line we are creating
    // a variable for a context
    val ctx = LocalContext.current
    val context = LocalContext.current
    Spacer(modifier = Modifier.height(16.dp))
    //login button

    Button(onClick = {
        val urlIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.google.com")
        )
        ctx.startActivity(urlIntent)
    }) {
        // on below line creating a text for our button.
        Text(
            // on below line adding a text ,
            // padding, color and font size.
            text = "To Open Google",
            modifier = Modifier.padding(10.dp),

            )
    }

}

@Preview
@Composable
fun simpleTextPreview(){
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        simpleText()

        simpleTextField()

        Column (modifier = Modifier.fillMaxSize(1f) ,verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally) {
            SimpleButton()
        }
    }
}