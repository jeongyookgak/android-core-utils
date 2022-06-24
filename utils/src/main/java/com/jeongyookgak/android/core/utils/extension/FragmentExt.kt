package com.jeongyookgak.android.core.utils.extension

import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import com.jeongyookgak.android.core.utils.extension.FragmentExt.TOAST_SHORT

object FragmentExt {
    const val TOAST_SHORT = Toast.LENGTH_SHORT
    const val TOAST_LONG = Toast.LENGTH_LONG
}

fun Fragment.showToast(message: String, duration: Int = TOAST_SHORT) {
    Toast.makeText(requireContext(), message, duration).show()
}

fun Fragment.addOnBackPressedCallback(listener: () -> Unit) {
    requireActivity().onBackPressedDispatcher.addCallback(
        viewLifecycleOwner,
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                listener.invoke()
            }
        }
    )
}
