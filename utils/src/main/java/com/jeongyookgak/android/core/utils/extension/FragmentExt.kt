package com.jeongyookgak.android.core.utils.extension

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jeongyookgak.android.core.utils.extension.FragmentExt.TOAST_SHORT

object FragmentExt {
    const val TOAST_SHORT = Toast.LENGTH_SHORT
    const val TOAST_LONG = Toast.LENGTH_LONG
}

fun Fragment.showToast(message: String, duration: Int = TOAST_SHORT) {
    Toast.makeText(requireContext(), message, duration).show()
}
