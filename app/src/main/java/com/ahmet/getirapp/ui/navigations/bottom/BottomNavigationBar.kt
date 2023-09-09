package com.ahmet.getirapp.ui.navigations.bottom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ahmet.getirapp.R


@Composable
fun BottomNavigationBar(navController: NavController, modifier: Modifier = Modifier) {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.ShoppingCart,
        NavigationItem.Shop,
        NavigationItem.ShoppingPackage,
        NavigationItem.User
    )

    Box(
        modifier = modifier
            .height(60.dp)
            .background(colorResource(id = R.color.getir_text_color).copy(0.3f))
        ) {
        Box(
            modifier = modifier
                .padding()
                .padding(bottom = 11.dp)
                .height(48.dp)
                .background(colorResource(id = R.color.getir_text_color).copy(0.1f))
        ) {
            BottomNavigation(
                backgroundColor = colorResource(id = R.color.getir_advertisement_background)
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                items.forEach { item ->
                    BottomNavigationItem(
                        selected = currentRoute == item.route,
                        onClick = {
                            navController.navigate(item.route) {
                                navController.graph.startDestinationRoute?.let { route ->
                                    popUpTo(route) {
                                        saveState = true
                                    }
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Icon(
                                painter = painterResource(id = item.icon),
                                contentDescription = null,
                                tint = Color.White
                            )
                        },
                        selectedContentColor = colorResource(id = R.color.yellow_color),
                        unselectedContentColor = colorResource(id = R.color.white),
                        alwaysShowLabel = true
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
        }
    }

}
