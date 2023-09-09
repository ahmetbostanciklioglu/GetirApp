package com.ahmet.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Beverage(
    @DrawableRes val productImage: Int,
    @DrawableRes val addButton: Int,
    @StringRes val productPrice: Int
)