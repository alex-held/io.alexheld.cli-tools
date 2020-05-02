plugins {
    idea
    id("org.jetbrains.kotlin.multiplatform") version "1.3.72"
    id("org.jetbrains.kotlin.kapt") version "1.3.72"
    id("org.jetbrains.dokka") version "0.10.1"
    id("org.jetbrains.gradle.plugin.idea-ext") version "0.7"
}

repositories {
    jcenter()
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
}

// enableFeaturePreview("GRADLE_METADATA")





