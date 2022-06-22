package com.jeongyookgak.android.core.utils.crashlytics

interface CrashlyticsHelper {

    fun report(error: Throwable)
    fun logAndReport(error: Throwable)

}

