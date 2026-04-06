plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.declarative.feature_details"
    compileSdk = 36
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}