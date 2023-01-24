package com.bbbrrr8877.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bbbrrr8877.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtSpaceScreen()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceScreen() {
    Column(
        modifier = Modifier.padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        ArtworkWall()
        ArtworkDescriptor()
        Spacer(modifier = Modifier.height(16.dp))
        DisplayController()
    }
}

//@Composable
//fun ArtworkWall() {
//    TODO("Not yet implemented")
//}

@Composable
fun ArtworkDescriptor() {
    Column(

    ) {
        Text(
            text = stringResource(R.string.artwork_title),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.artwork_artist),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 18.sp
        )
    }
}

@Composable
fun DisplayController() {
    Row() {
        Button(
            onClick = { /*TODO*/ }
        ) {
            
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(
            onClick = { /*TODO*/ }
        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpaceScreen()
    }
}