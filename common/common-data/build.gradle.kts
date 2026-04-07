plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

dependencies {
    implementation(libs.retrofit)
    implementation(libs.coroutines)
    implementation(libs.kotlinx.serialization)
}