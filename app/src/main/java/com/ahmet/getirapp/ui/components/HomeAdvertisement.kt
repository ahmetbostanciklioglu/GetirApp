package com.ahmet.getirapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmet.getirapp.R

@Composable
fun HomeAdvertisement(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .background(Color.White)
            .fillMaxWidth()
            .height(103.dp)
    ) {

        Column {

            Box (
                modifier = modifier
                    .background(colorResource(id = R.color.getir_advertisement_background))
                    .fillMaxWidth()
                    .height(103.dp)
            ) {
                Column(
                    modifier = modifier
                        .padding(start = 14.dp, top = 16.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.indirim_text),
                        style = TextStyle(
                            fontSize = 19.sp,
                            fontFamily = FontFamily(Font(R.font.rubik)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                            lineHeight = 0.89.sp
                        ),

                        )
                    Spacer(modifier = modifier.height(5.dp))
                    Text(
                        text = stringResource(id = R.string.indirim_text_detail),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.rubik)),
                            fontWeight = FontWeight(300),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                }
            }
        }

        Column(
            modifier = modifier
                .align(Alignment.CenterEnd)
                .width(165.dp)
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = R.drawable.getir_motorcycle),
                contentDescription = null,
                modifier = modifier
                    .width(165.dp)
                    .padding(bottom = 1.dp),
                contentScale = ContentScale.Crop
            )

        }

    }
}

@Preview
@Composable
fun HomeAdvertisementPreview() {
    MaterialTheme {
        HomeAdvertisement()
    }
}