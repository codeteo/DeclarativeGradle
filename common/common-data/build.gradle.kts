plugins {
    kotlin("jvm")
    id("dev.zacsweers.metro") version "0.13.1"
}

dependencies {
    implementation(projects.common.commonDomain)
    implementation(projects.core.model)
}