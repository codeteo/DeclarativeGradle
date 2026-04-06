pluginManagement {
    includeBuild("build-logic")
    repositories {
//        google {
//            content {
//                includeGroupByRegex("com\\.android.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("androidx.*")
//            }
//        }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
//    id("org.gradle.experimental.android-ecosystem").version("0.1.57")
    id("org.gradle.toolchains.foojay-resolver-convention").version("1.0.0")
}

//defaults {
//    androidApplication {
//        jdkVersion = 17
//        minSdk = 21
//        targetSdk = 34
//        compileSdk = 36
//
//        lint {
//            enabled = true
//            }
//        }
//}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
//    repositoriesMode = FAIL_ON_PROJECT_REPOS
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MyDeclarativeGradle"
include(":app")
 