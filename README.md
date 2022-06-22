## how to use
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


## how to release
1. master에 코드를 push한 후, release에서 태그를 붙여줍니다.
2. **[jitpack](https://jitpack.io/private#jeongyookgak/android-core-utils)** 에서 look up 버튼을 눌러 최신 릴리즈 버전을 불러옵니다.
3. 최신 릴리즈 버전 옆의 Get it 버튼을 누르고, 빌드가 완료될 때 까지 기다려줍니다. 이 때 빨간 아이콘이 뜰 경우 배포 실패이니, 아이콘을 눌러 로그를 확인 후 수정합니다.
4. 배포가 완료되었습니다. 해당 릴리즈 버전을 implements해줍니다!
