

plugins {
    idea
    id("name.remal.kotlin-settings") version "1.0.186"
    id("name.remal.osdetector") version "1.0.186"
    id("name.remal.idea-extended-settings") version "1.0.186"
    id("name.remal.buildSrc-default-plugins") version "1.0.186"
    id("org.jetbrains.kotlin.multiplatform") version "1.3.72"
    id("org.jetbrains.kotlin.kapt") version "1.3.72"
    id("org.jetbrains.dokka") version "0.10.1"
    id("org.jetbrains.gradle.plugin.idea-ext") version "0.7"
}


repositories {
    maven("https://plugins.gradle.org/m2/")
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    gradlePluginPortal()
    mavenCentral()
    jcenter()
}

