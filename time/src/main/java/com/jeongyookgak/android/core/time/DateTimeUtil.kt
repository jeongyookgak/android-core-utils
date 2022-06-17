package com.jeongyookgak.android.core.time

interface DateTimeUtil {

    fun now(): String
    fun parse(targetDateTime: String, format: String?): String
    fun parse(year: Int, month: Int, day: Int, hour: Int?, minuet: Int?, second: Int?): String

}

//    fun isToday(): Boolean
//    fun isYesterDay(): Boolean
//    fun isTomorrow(): Boolean
//    fun isBeforeToday(): Boolean
//    fun isAfterToday(): Boolean
