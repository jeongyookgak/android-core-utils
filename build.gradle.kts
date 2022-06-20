buildscript {
    repositories {
        google()
    }

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
    }
}

plugins {
    id("com.android.application") version "7.2.0" apply false
    id("com.android.library") version "7.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.6.21" apply false
}

task ("clean", Delete::class) {
    delete(rootProject.buildDir)
}