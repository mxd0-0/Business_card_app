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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
    val image = painterResource(R.drawable.android_logo)
    val colorg = Color(0xFFB9CCB9)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorg)



    )
    {
        Column(
            modifier = modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
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


        Column(modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom ) {
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_local_phone_24),
                    contentDescription = null,
                    modifier.padding(end = 26.dp)
                )
                Text("11111111111111", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
            }
            Row(
                modifier = modifier.fillMaxWidth().padding(top = 16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_share_24),
                    contentDescription = null,
                    modifier.padding(end = 26.dp)
                )
                Text("@mxd0-0", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
            }
            Row(
                modifier = modifier.fillMaxWidth().padding(top = 16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_mail_24),
                    contentDescription = null,
                    modifier.padding(end = 26.dp)
                )
                Text("mo7amxd.7@gmail.com", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
            }
        }

    }
}


@Preview
@Composable
private fun Preview() {
    UpperInfo()
}