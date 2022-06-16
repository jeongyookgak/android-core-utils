package com.jeongyookgak.android.core.time

interface TimeUtil {
    fun now(): String
    fun isYesterDay(): Boolean
    fun toDDDStyleName(): String
}