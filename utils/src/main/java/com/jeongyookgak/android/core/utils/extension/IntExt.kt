package com.jeongyookgak.android.core.utils.extension

fun Int?.orZero() = this ?: 0

fun Int.format12Hour() = when {
    this <= 12 -> this
    else -> (this - 12)
}