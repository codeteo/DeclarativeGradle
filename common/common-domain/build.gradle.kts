plugins {
    kotlin("jvm")
    id("dev.zacsweers.metro") version "0.13.1"
}

dependencies {
    implementation(libs.retrofit)
    implementation(libs.coroutines)

    implementation(projects.core.model)
    implementation(projects.common.commonData)
}