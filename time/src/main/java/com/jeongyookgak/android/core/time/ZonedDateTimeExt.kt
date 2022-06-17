package com.jeongyookgak.android.core.time

import org.threeten.bp.*
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.format.TextStyle
import org.threeten.bp.temporal.ChronoUnit
import org.threeten.bp.temporal.TemporalAdjusters
import java.util.*

@Suppress("SpellCheckingInspection")
object ZonedDateTimeExt {
    const val ZONE_ID_KOREA = "Asia/Seoul"
    const val MONDAY_IN_CHRONO_FIELD = 1L
}

fun ZonedDateTime.toEpochMilli() = this.toInstant().toEpochMilli()

fun ZonedDateTime.getDaysFrom(from: ZonedDateTime) = Duration.between(from, this).toDays().toInt()

fun ZonedDateTime.getMillisFrom(from: ZonedDateTime) = Duration.between(from, this).toMillis().toInt()

fun ZonedDateTime.isToday() = this.toLocalDate() == LocalDate.now(zone)

fun ZonedDateTime.isTomorrow() = this.toLocalDate() == LocalDate.now(zone).plusDays(1)

fun ZonedDateTime.isDayAfterTomorrow() = this.toLocalDate() == LocalDate.now(zone).plusDays(2)

fun DayOfWeek.getShortDisplayName(locale: Locale = Locale.getDefault()): String = this.getDisplayName(TextStyle.SHORT, locale)

fun DayOfWeek.getDisplayName(locale: Locale = Locale.getDefault()): String = this.getDisplayName(TextStyle.FULL, locale)

fun ZonedDateTime.isWeekend() = dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY

fun ZonedDateTime.inTimePeriod(startHour: Int, startMin: Int = 0, endHour: Int, endMin: Int = 0) = (hour * 60 + minute).let { mins ->
    (startHour * 60 + startMin) <= mins && mins <= (endHour * 60 + endMin)
}

fun ZonedDateTime.getTripleNextSunday(): ZonedDateTime = getLatestSunday().plusWeeks(3)

fun ZonedDateTime.getLatestSunday(): ZonedDateTime = this
    .with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY))
    .truncatedTo(ChronoUnit.DAYS)

fun ZonedDateTime.getYYYYMDE(): String = this.format(DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E)"))
