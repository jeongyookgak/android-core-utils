package com.jeongyookgak.android.core.utils.extension

import android.content.Intent
import android.net.Uri

fun Uri.toDeepLinkIntent() = Intent(Intent.ACTION_VIEW, this)