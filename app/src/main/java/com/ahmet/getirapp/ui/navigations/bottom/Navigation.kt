package com.ahmet.getirapp.ui.navigations.bottom

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ahmet.getirapp.ui.home.HomeScreen

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }
        composable(NavigationItem.ShoppingCart.route) {
            HomeScreen()
        }
        composable(NavigationItem.Shop.route) {
            HomeScreen()
        }
        composable(NavigationItem.ShoppingPackage.route) {
            HomeScreen()
        }
        composable(NavigationItem.User.route) {
            HomeScreen()
        }
    }
}