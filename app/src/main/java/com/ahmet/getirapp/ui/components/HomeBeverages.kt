package com.ahmet.getirapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmet.data.Beverage
import com.ahmet.data.BeverageRepository
import com.ahmet.getirapp.R

@Composable
fun HomeBeverages(count: Int, modifier: Modifier = Modifier, beverageList: List<Beverage>) {
    HomeBeverageLazyVerticalGrid(beverageList = beverageList, count = count, modifier = modifier)
}

@Composable
fun HomeBeverageLazyVerticalGrid(beverageList: List<Beverage>, modifier: Modifier = Modifier, count: Int) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(count),
        modifier = modifier.background(Color.White),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 24.dp)
    ) {
        items(beverageList) { beverage ->
            HomeBeverageCard(
                productImage = beverage.productImage,
                addButton = beverage.addButton,
                productPrice = beverage.productPrice
            )
        }
    }
}

@Composable
fun HomeBeverageCard(
    productImage: Int,
    modifier: Modifier = Modifier,
    addButton: Int,
    productPrice: Int
) {
    Card(
        modifier = modifier
            .width(80.dp)
            .height(117.33334.dp)
            .background(Color.Transparent),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = modifier.background(Color.White)
        ) {
            Image(
                painter = painterResource(id = productImage),
                contentDescription = null,
                modifier = modifier.size(80.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier.padding(top = 16.dp, start = 11.dp)
            ) {
                Box(modifier = modifier
                    .width(14.dp)
                    .fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = addButton),
                        contentDescription = null,
                        modifier = modifier
                            .fillMaxSize()
                            .background(Color.Transparent),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_add),
                        contentDescription = null,
                        modifier = modifier
                            .fillMaxSize()
                            .padding(start = 1.8.dp, top = 1.8.dp, bottom = 2.dp, end = 2.5.dp)
                            .background(Color.Transparent)

                    )

                }
                Spacer(modifier = Modifier.width(7.dp))
                Text(
                    text = stringResource(id = productPrice),
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = FontFamily(Font(R.font.rubik)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    )
                )
            }
            Spacer(modifier = Modifier.height(9.dp))
        }
    }
}

@Preview
@Composable
fun HomeBeveragesPreview() {
    val beverageRepository = BeverageRepository.beverageList()
    MaterialTheme {
        HomeBeverages(count = 2, beverageList = beverageRepository)
    }
}

