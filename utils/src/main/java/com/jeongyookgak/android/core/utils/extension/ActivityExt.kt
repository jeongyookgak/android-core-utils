package com.jeongyookgak.android.core.utils.extension

import android.app.Activity
import android.widget.Toast
import com.jeongyookgak.android.core.utils.extension.ActivityExt.TOAST_SHORT

object ActivityExt {
    const val TOAST_SHORT = Toast.LENGTH_SHORT
    const val TOAST_LONG = Toast.LENGTH_LONG
}

fun Activity.showToast(message: String, duration: Int = TOAST_SHORT) {
    Toast.makeText(this, message, duration).show()
}
