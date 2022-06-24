package com.jeongyookgak.android.core.utils.version

import android.app.Application
import android.content.pm.PackageInfo
import android.os.Build
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class DefaultVersionHelper @Inject constructor(
    @ApplicationContext private val application: Application
) : VersionHelper {

    override fun getVersionName(): String = getPackageInfo().versionName

    override fun getVersionCode(): Long {
        val packageInfo = getPackageInfo()

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            packageInfo.longVersionCode
        } else {
            packageInfo.versionCode.toLong()
        }
    }

    private fun getPackageInfo(): PackageInfo {
        return application.packageManager.getPackageInfo(application.packageName, 0)
    }

}