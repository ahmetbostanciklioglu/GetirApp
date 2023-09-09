package com.ahmet.getirapp.ui.navigations.top

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmet.getirapp.R

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun HomeNavigationBar(modifier: Modifier = Modifier) {

    val customFontFamily = FontFamily(Font(R.font.jihosoft))
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_navigation),
            contentDescription = "Navigation icon"
        )
        Text(
            text = "getir",
            fontWeight = FontWeight.Bold,
            fontFamily = customFontFamily,
            fontSize = 28.sp,
            color = colorResource(id = R.color.yellow_color)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_profile),
            contentDescription = "Profile image",
            contentScale = ContentScale.FillHeight,
            modifier = modifier.size(40.dp)
        )
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Preview(showBackground = true)
@Composable
fun HomeNavigationBarPreview() {
    MaterialTheme {
        HomeNavigationBar()
    }
}