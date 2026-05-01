import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

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

repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
}

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

configure<com.lagradost.cloudstream3.gradle.CloudstreamExtension> {
    // Basic config
}

configure<com.android.build.gradle.LibraryExtension> {
    namespace = "com.myname"
    compileSdk = 34
    
    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

// This is a more stable way to set the JVM target for Kotlin
tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}
