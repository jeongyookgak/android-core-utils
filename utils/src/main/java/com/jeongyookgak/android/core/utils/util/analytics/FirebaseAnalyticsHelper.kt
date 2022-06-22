package com.jeongyookgak.android.core.utils.util.analytics

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@SuppressLint("MissingPermission")
class FirebaseAnalyticsHelper @Inject constructor(
    @ApplicationContext private val context: Context
) : AnalyticsHelper {

    override fun logEvent(eventName: String) { }

    override fun logEvent(eventName: String, params: Map<String, Any?>) { }

    override fun logEvent(eventName: String, params: Bundle) { }
}
