package com.ahmet.getirapp.ui.navigations.bottom

import com.ahmet.getirapp.R

sealed class NavigationItem(var route: String, var icon: Int) {
    object Home : NavigationItem("home", R.drawable.ic_home)
    object ShoppingCart : NavigationItem("shoppingCart", R.drawable.ic_shopping_cart)
    object Shop : NavigationItem("shop", R.drawable.ic_shop)
    object ShoppingPackage : NavigationItem("shoppingPackage", R.drawable.ic_shopping_package)
    object User : NavigationItem("user", R.drawable.ic_user)
}