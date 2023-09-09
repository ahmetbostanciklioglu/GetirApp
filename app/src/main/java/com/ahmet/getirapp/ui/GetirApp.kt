package com.ahmet.getirapp.ui

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.ahmet.getirapp.ui.navigations.bottom.BottomNavigationBar
import com.ahmet.getirapp.ui.navigations.bottom.Navigation

@RequiresApi(Build.VERSION_CODES.Q)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun GetirApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) },
        content = { padding ->
            Box(
                modifier = Modifier.padding(padding)
            ) {
                Navigation(navController = navController)
            }
        },
        backgroundColor = Color.White
    )
}

@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
fun GetirAppPreview() {
    MaterialTheme {
        GetirApp()
    }
}