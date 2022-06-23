package com.jeongyookgak.android.core.utils.crashlytics

interface CrashlyticsHelper {

    /*
        디버그 모드일때 Crashlytics에 기록되지 않게 하기 위해서는 아래 코드를 build.gradle에 넣어주어야합니다.
        buildTypes {
            getByName("debug") {
                manifestPlaceholders["crashlyticsCollectionEnabled"] = false

                ...
            }
            getByName("release") {
                ...
            }
        }
    */

    fun report(error: Throwable)
    fun logAndReport(error: Throwable)

}
