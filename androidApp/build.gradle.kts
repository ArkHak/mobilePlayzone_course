plugins {
    id("com.android.application")
    id("org.jetbrains.compose")
    kotlin("android")
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "org.example.android"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":common:umbrella-compose"))
    implementation("androidx.compose.runtime:runtime:1.1.0")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.appcompat:appcompat:1.5.0")
}