package com.example.recyclerview

import androidx.annotation.DrawableRes


const val PICTURE = "PICTURE"
const val START_DATE = "START_DATE"
const val END_DATE = "END_DATE"
const val COMP_NAME = "COMP_NAME"
const val COMP_ADDRESS = "COMP_ADDRESS"
data class Education (
    @DrawableRes
    val PicEduc: Int,
    val StartDate: String,
    val EndDate: String,
    val CompanyName: String,
    val CompanyAddress: String,
)


