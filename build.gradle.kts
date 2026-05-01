maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
        classpath("com.github.recloudstream:gradle:master-SNAPSHOT")
    }
}

// THIS IS THE NEW PART WE ARE ADDING
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
}
