buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
        classpath("com.github.recloudstream:gradle:master-SNAPSHOT")
    }
}

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

// We use the simplest possible call here
configure<com.lagradost.cloudstream3.gradle.CloudstreamExtension> {
    // No destination or setDestConfig lines - let it use defaults
}

configure<com.android.build.gradle.LibraryExtension> {
    namespace = "com.myname"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
    }
}
