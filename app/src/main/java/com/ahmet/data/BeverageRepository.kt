package com.ahmet.data

import com.ahmet.getirapp.R

object BeverageRepository {
    fun beverageList(): List<Beverage> = listOf(
        Beverage(
            productImage = R.drawable.juss,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.juis_price
        ),
        Beverage(
            productImage = R.drawable.coca_cola,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.coca_cola_price
        ),
        Beverage(
            productImage = R.drawable.fruit_extra,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.fruit_extra_price
        ),
        Beverage(
            productImage = R.drawable.link,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.link_price
        ),
        Beverage(
            productImage = R.drawable.beypazari,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.beypazari_price
        ),
        Beverage(
            productImage = R.drawable.sprite,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.sprite_price
        ),
        Beverage(
            productImage = R.drawable.redbull,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.redbull_price
        ),
        Beverage(
            productImage = R.drawable.monster,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.monster_price
        ),
    )

    fun snackList(): List<Beverage> = listOf(
        Beverage(
            productImage = R.drawable.doritos_nacho,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.juis_price
        ),
        Beverage(
            productImage = R.drawable.doritos_extreme,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.coca_cola_price
        ),
        Beverage(
            productImage = R.drawable.pringles,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.fruit_extra_price
        ),
        Beverage(
            productImage = R.drawable.lays,
            addButton = R.drawable.add_button_background,
            productPrice = R.string.link_price
        )
    )
}