plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.declarative.core_data"
    compileSdk = 36
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
}