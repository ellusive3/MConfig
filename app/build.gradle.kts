plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    kotlin("plugin.serialization")
}

android {
    namespace = "ru.monjaro.mconfig"
    compileSdk = 35

    defaultConfig {
        applicationId = "ru.monjaro.mconfig"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "0.104"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_9
        targetCompatibility = JavaVersion.VERSION_1_9
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_9.toString()
    }

    buildFeatures {

        buildConfig = true
        viewBinding = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation(platform("androidx.compose:compose-bom:2024.11.00"))
    implementation("androidx.compose.material3:material3")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation ("androidx.preference:preference-ktx:1.2.1")//

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")
    compileOnly(files("libs\\ecarx.adaptapi.jar"))
    compileOnly(files("libs\\ecarx.jar"))
}