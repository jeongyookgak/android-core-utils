package com.jeongyookgak.android.core.utils.util.analytics

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import com.jeongyookgak.android.core.utils.extension.showToast
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@SuppressLint("MissingPermission")
class FirebaseAnalyticsHelperr @Inject constructor(
    @ApplicationContext private val context: Context
) : AnalyticsHelperr {

    override fun logEvent(eventName: String) {
        context.showToast("테스트!!")
        Log.e("jhim", eventName)
    }

    override fun logEvent(eventName: String, params: Map<String, Any?>) {
        Log.e("jhim", eventName)
    }

    override fun logEvent(eventName: String, params: Bundle) {
        Log.e("jhim", eventName)
    }
}
