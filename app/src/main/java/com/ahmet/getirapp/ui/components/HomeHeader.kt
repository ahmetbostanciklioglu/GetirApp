package com.ahmet.getirapp.ui.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmet.getirapp.R
import com.ahmet.getirapp.ui.navigations.top.HomeNavigationBar

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun HomeHeader(modifier: Modifier = Modifier) {

    val annotatedString = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = Color.White,
                fontSize = 41.sp,
                fontWeight = FontWeight(500)
            )
        ) {
            append(stringResource(id = R.string.getir_bi))
        }
        withStyle(
            style = SpanStyle(
                color = colorResource(id = R.color.yellow_color),
                fontSize = 41.sp,
                fontWeight = FontWeight(500)
            )
        ) {
            append(stringResource(id = R.string.mutluluk))
        }
    }

    val gradientBrush = Brush.verticalGradient(
        colors = listOf(
            colorResource(id = R.color.getir_text_color).copy(0.60f),
            colorResource(id = R.color.getir_text_color).copy(0.85f)
        )
    )

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(360.dp)
            .background(Color.White),
        shape = RoundedCornerShape(bottomStart = 100.dp, bottomEnd = 100.dp)
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(brush = gradientBrush)
                .clip(
                    RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp,
                        bottomEnd = 50.dp,
                        bottomStart = 70.dp
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.background_image),
                contentDescription = null,
                modifier = modifier.fillMaxSize()
            )

            Column(
                modifier = modifier
                    .fillMaxSize(),
                //    .background(brush = gradientBrush),
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                Spacer(modifier = Modifier.height(10.dp))
                HomeNavigationBar(modifier = modifier.padding(horizontal = 10.dp))
                Text(
                    text = annotatedString,
                    modifier = modifier
                        .padding(top = 50.dp)
                )
                Text(
                    text = stringResource(id = R.string.istedigin_urunu_hemen_sec),
                    style = TextStyle(
                        fontSize = 20.8.sp,
                        fontFamily = FontFamily(Font(R.font.rubik)),
                        fontWeight = FontWeight(300),
                        color = Color(0xFFFFFFFF),
                    ),
                    modifier = modifier.padding(top = 20.dp)
                )
                Spacer(modifier = Modifier.height(31.dp))
                HomeTextField()
            }
        }


    }
}

@Composable
fun HomeTextField(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }
    val focusRequester = remember { FocusRequester() }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(30.dp)
            .padding(horizontal = 20.dp)
            .background(Color.White, RoundedCornerShape(5.dp))
    ) {
        BasicTextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            textStyle = TextStyle(
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            ),
            singleLine = true,
            modifier = modifier
                .fillMaxSize()
                .padding(start = if (text.isEmpty()) 40.dp else 32.dp, top = 6.dp)
                .focusRequester(focusRequester = focusRequester),
            cursorBrush = SolidColor(Color.Black),
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                }
            )
        )

        if (text.isEmpty()) {
            Row(
                modifier = modifier.fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Spacer(modifier = modifier.width(6.dp))
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    modifier.padding(vertical = 4.dp)
                )
                Spacer(modifier = modifier.width(12.dp))
                Text(
                    text = stringResource(id = R.string.getir_search_placeholder_text),
                    color = Color(0x80000000),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = FontFamily(Font(R.font.rubik)),
                    modifier = modifier.padding(top = 4.dp),
                    overflow = TextOverflow.Ellipsis
                )
            }

        }
    }

}


@RequiresApi(Build.VERSION_CODES.Q)
@Preview(showBackground = true)
@Composable
fun HomeHeaderPreview() {
    MaterialTheme {
        HomeHeader()
    }
}