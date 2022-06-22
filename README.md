# android-core-utils

app단의 build.gradle 파일에 아래 코드를 추가해주세요.
```
implementation("com.github.jeongyookgak:android-core-utils:${latest-release-version}")
```
manifests의 <Application> 태그 안에 아래 코드를 추가해주세요.
```
<provider
  android:name="com.jeongyookgak.android.core.utils.ContentProvider"
  android:authorities="com.jeongyookgak.android.core.utils.ContentProvider"
  android:exported="false"
/>
       
<provider
  android:name="com.jeongyookgak.android.core.time.ContentProvider"
  android:authorities="com.jeongyookgak.android.core.time.ContentProvider"
  android:exported="false"
/>
```