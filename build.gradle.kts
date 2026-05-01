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

// We use "extensions.configure" to make sure the plugin is loaded first
extensions.configure<com.lagradost.cloudstream3.gradle.CloudstreamExtension>("cloudstream") {
    destination = file("builds")
}

configure<com.android.build.gradle.LibraryExtension> {
    namespace = "com.myname"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
    }
}
