package com.jeongyookgak.android.core.utils.extension

fun <T> List<T>?.orEmptyList() = this ?: listOf()

fun <T, V> Map<T, V>?.orEmptyMap() = this ?: mapOf()
