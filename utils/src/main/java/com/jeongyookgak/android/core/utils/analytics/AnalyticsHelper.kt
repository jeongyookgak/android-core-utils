package com.jeongyookgak.android.core.utils.analytics

import android.os.Bundle

interface AnalyticsHelper {

    // fun logEvent(event: Event)
    fun logEvent(eventName: String)
    fun logEvent(eventName: String, params: Map<String, Any?>)
    fun logEvent(eventName: String, params: Bundle)
}
