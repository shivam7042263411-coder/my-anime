import com.lagradost.cloudstream3.gradle.CloudstreamExtension

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        // We are using a stable version of the gradle plugin
        classpath("com.github.recloudstream:gradle:master-SNAPSHOT")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
    }
}

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

// This block tells the builder where to save the .sub file
cloudstream {
    destination = file("builds")
}

// Basic Android settings required for the build
android {
    namespace = "com.myname"
    compileSdk = 34
    
    defaultConfig {
        minSdk = 21
    }
}
