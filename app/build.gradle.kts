import configuration.AndroidSdk

plugins {
    alias(libs.plugins.dicta.android.application)
    alias(libs.plugins.dicta.compose.application)
    alias(libs.plugins.dicta.convention.koin)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.google.services)
    alias(libs.plugins.firebase.crashlytics)
    alias(libs.plugins.firebase.performance)
    alias(libs.plugins.detekt)
    alias(libs.plugins.ksp)
}

android {
    namespace = AndroidSdk.namespace

    defaultConfig {
        applicationId = AndroidSdk.applicationId
        versionCode = AndroidSdk.versionCode
        versionName = AndroidSdk.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
            isShrinkResources = false
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-debug"
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {

    //    implementation(libs.androidx.core.ktx)
    //    implementation(libs.androidx.lifecycle.runtime.ktx)
    //    implementation(libs.compose.activity)
    //    implementation(platform(libs.compose.bom))
    //    implementation(libs.compose.ui)
    //    implementation(libs.compose.ui.graphics)
    //    implementation(libs.compose.ui.tooling.preview)
    //    implementation(libs.compose.material3)
    //    testImplementation(libs.junit)
    //    androidTestImplementation(libs.androidx.test.espresso.core)
    //    androidTestImplementation(platform(libs.compose.bom))
}
