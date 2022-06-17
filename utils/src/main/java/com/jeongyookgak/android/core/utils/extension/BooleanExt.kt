package com.jeongyookgak.android.core.utils.extension

fun Boolean.toInt() = if (this) 1 else 0

fun Boolean?.orNot() = this ?: false