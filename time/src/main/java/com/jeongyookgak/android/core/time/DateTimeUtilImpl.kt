package com.jeongyookgak.android.core.time

import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZonedDateTime
import org.threeten.bp.format.DateTimeFormatter

class DateTimeUtilImpl : DateTimeUtil {

    override fun now(): String {
        return LocalDateTime.now().toString()
    }

    override fun parse(targetDateTime: String, format: String?): String {
        return if (format == null) {
            LocalDateTime.parse(targetDateTime).toString()
        } else {
            LocalDateTime.parse(targetDateTime, DateTimeFormatter.ofPattern(format)).toString()
        }
    }

    override fun parse(
        year: Int,
        month: Int,
        day: Int,
        hour: Int?,
        minuet: Int?,
        second: Int?
    ): String {
        return LocalDateTime.of(year, month, day, hour ?: 0, minuet ?: 0, second ?: 0).toString()
    }

}