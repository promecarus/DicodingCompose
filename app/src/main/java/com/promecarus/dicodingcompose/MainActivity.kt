package com.promecarus.dicodingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.promecarus.dicodingcompose.ui.theme.DicodingComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DicodingComposeTheme {
                DicodingComposeApp()
            }
        }
    }
}

private val sampleName = listOf(
    "Andre",
    "Desta",
    "Parto",
    "Wendy",
    "Komeng",
    "Raffi Ahmad",
    "Andhika Pratama",
    "Vincent Ryan Rompies"
)

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun DicodingComposeApp() {
    Surface(modifier = Modifier.fillMaxSize(), color = colorScheme.background) {
        GreetingList(sampleName)
    }
}

@Composable
fun GreetingList(names: List<String>) {
    if (names.isNotEmpty()) Column { names.forEach { Greeting(it) } }
    else Text("No people to greet :(")
}

@Composable
fun Greeting(name: String) {
    Row(
        modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.jetpack_compose),
            contentDescription = "Logo Jetpack Compose",
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = "Hello $name!",
                fontSize = 24.sp,
                fontWeight = Bold,
            )
            Text(text = "Welcome to Dicoding!")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DicodingComposeTheme {
        Greeting("Android")
    }
}
