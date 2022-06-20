package com.jeongyookgak.android.core.utils.util.analytics

import android.content.Context
import android.os.Bundle
import android.util.Log
import com.jeongyookgak.android.core.utils.extension.showToast
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class FirebaseAnalyticsHelperr @Inject constructor(
    @ApplicationContext private val context: Context
) : AnalyticsHelperr {

    override fun logEvent(eventName: String) {
        context.showToast("테스트!!")
        Log.e("jhim", eventName)
        TODO("Not yet implemented")
    }

    override fun logEvent(eventName: String, params: Map<String, Any?>) {
        TODO("Not yet implemented")
    }

    override fun logEvent(eventName: String, params: Bundle) {
        TODO("Not yet implemented")
    }

}