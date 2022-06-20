# android-core-utils

manifests 파일에 아래 코드를 추가해주세요.
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
