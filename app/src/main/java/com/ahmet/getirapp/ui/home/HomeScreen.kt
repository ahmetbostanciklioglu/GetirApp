package com.ahmet.getirapp.ui.home

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmet.data.BeverageRepository
import com.ahmet.getirapp.ui.components.HomeAdvertisement
import com.ahmet.getirapp.ui.components.HomeBeverages
import com.ahmet.getirapp.ui.components.HomeHeader

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun HomeScreen(modifier: Modifier = Modifier, beverages: BeverageRepository = BeverageRepository) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        HomeHeader()
        HomeBeverages(
            count = 2,
            modifier = modifier.height(297.dp),
            beverageList = beverages.beverageList()
        )
        HomeAdvertisement()
        HomeBeverages(
            count = 1,
            modifier = modifier.height(166.dp),
            beverageList = beverages.snackList()
        )
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
fun HomeScreenPreview() {
    val beverages = BeverageRepository
    MaterialTheme {
        HomeScreen(beverages = beverages)
    }
}