package com.hgapp.qrbar.extension

fun Double?.orZero(): Double {
    return this ?: 0.0
}