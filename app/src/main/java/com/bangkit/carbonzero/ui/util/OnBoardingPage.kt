package com.bangkit.carbonzero.ui.util

import androidx.annotation.DrawableRes
import com.bangkit.carbonzero.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.first,
        title = "Energy-efficient equipment",
        description = "Energy-efficient equipment is designed to consume less energy than standard equipment while providing the same level of performance."
    )

    object Second : OnBoardingPage(
        image = R.drawable.second,
        title = "How to Shop Sustainably",
        description = "Buying less is the first step. Beyond that, there are simple ways to reduce the impact from your purchases."
    )

    object Third : OnBoardingPage(
        image = R.drawable.third,
        title = "How to Recycle",
        description = "Recycling can help reduce the amount of waste generated, conserve natural resources, and reduce greenhouse gas emissions. "
    )
}
