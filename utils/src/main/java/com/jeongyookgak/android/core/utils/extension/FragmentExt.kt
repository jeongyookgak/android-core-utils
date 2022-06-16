package com.jeongyookgak.android.core.utils.extension

import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentExt {

    fun Fragment.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(requireContext(), message, duration).show()
    }

}