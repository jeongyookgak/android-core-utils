package com.jeongyookgak.android.core.utils.analytics

import android.content.Context
import android.util.Log
import androidx.core.os.bundleOf
import com.jeongyookgak.android.core.time.TimeUtil
import java.text.SimpleDateFormat
import java.util.*

class AnalyticsHelper(
    private val timeUtil: TimeUtil
) {

    fun logGetTimestampOfFirstDay(context: Context, calendar: Calendar, plusDate: Int) {
        val bundle = bundleOf(
            "calendar" to SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.KOREA).format(calendar.time),
            "system_date" to timeUtil.now(),
            "plus_date" to plusDate,
        )
//        FirebaseAnalytics.getInstance(context).logEvent("getTimestampOfFirstday", bundle)
    }
}