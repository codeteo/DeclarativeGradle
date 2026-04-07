plugins {
    kotlin("jvm")
}

dependencies {
    implementation(libs.retrofit)
    implementation(libs.coroutines)

    implementation(projects.core.model)
}