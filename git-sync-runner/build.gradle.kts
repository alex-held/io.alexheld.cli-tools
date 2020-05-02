

plugins {
    id("org.jetbrains.kotlin.multiplatform") version "1.3.72"
    id("org.jetbrains.kotlin.kapt") version "1.3.72"
    id("org.jetbrains.gradle.plugin.idea-ext") version "0.7"
    java
    idea
}


repositories() {
    mavenCentral()
    jcenter()
}
