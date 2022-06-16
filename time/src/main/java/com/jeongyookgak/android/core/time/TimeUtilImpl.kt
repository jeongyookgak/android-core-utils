package com.jeongyookgak.android.core.time

import org.threeten.bp.ZonedDateTime

class TimeUtilImpl : TimeUtil {
    override fun now(): String {
        return ZonedDateTime.now().toString()
    }

    override fun isYesterDay(): Boolean {
        TODO("Not yet implemented")
    }

    override fun toDDDStyleName(): String {
        TODO("Not yet implemented")
    }
}