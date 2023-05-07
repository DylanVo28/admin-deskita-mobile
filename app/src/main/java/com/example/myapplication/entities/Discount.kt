package com.example.myapplication.entities

import java.util.*
class Discount (val discounts:List<CartItem>)
class DiscountItem(
    val _id: String,
    val createAt: Date,
    val name: String,
    val categoryProduct: String,
    val validDate: Date,
    val quantity: Int,
    var value: Int,
    val userId: String,
    var used: Boolean,
) {
}