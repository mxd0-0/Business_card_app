package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun UpperInfo(modifier: Modifier = Modifier) {
    val colorg = Color(0xFFB9CCB9)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorg)


    ) {
        Moh(
            modifier = modifier.align(Alignment.Center)

        )
        Column(
            modifier = Modifier
                .padding(bottom = 40.dp, start = 1.dp)
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Info(
                image = painterResource(R.drawable.baseline_local_phone_24),
                text = "123-456-7890",
                modifier = modifier

            )
            Info(
                image = painterResource(R.drawable.baseline_share_24),
                text = "mxd0-0",
                modifier = modifier

            )
            Info(
                image = painterResource(R.drawable.baseline_mail_24),
                text = "moh@moh.com",
                modifier = modifier

            )
        }


    }
}

@Composable
fun Info(image: Painter, text: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Icon(
            painter = image, contentDescription = null,
            modifier
                .padding(end = 16.dp)
                .size(24.dp)
        )
        Text(text, fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
    }


}

@Composable
fun Moh(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .size(height = 150.dp, width = 150.dp)
                .background(
                    Color(0xFF3A4831)

                )
        )
        Text(
            text = "Jennifer Doe",
            letterSpacing = 6.sp,
            fontSize = 28.sp,
            color = Color.Black,
            modifier = modifier.padding(top = 4.dp),
            fontWeight = FontWeight.Light
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontWeight = FontWeight.Bold,
            color = Color(0xFF446C2C),
            modifier = modifier.padding(top = 8.dp)
        )

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Preview() {
    UpperInfo()


}