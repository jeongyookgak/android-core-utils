package com.jeongyookgak.android.core.utils.crashlytics

import com.google.firebase.crashlytics.FirebaseCrashlytics
import javax.inject.Inject

class FirebaseCrashlyticsHelper @Inject constructor() : CrashlyticsHelper {

    override fun report(error: Throwable) {
        FirebaseCrashlytics.getInstance().recordException(error)
    }

    override fun logAndReport(error: Throwable) {

    }

}
