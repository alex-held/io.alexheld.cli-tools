

package io.alexheld.`cli-tools`.buildSrc



object PluginVersions {
    const val dokka = "0.10.1"
    const val kotlin = "1.3.72"
    const val vplugin = "3.0.3"
    const val idea_ext = "3.0.3"
}

object Versions {
    const val assertJ = "3.15.0"
    const val coroutines = "1.3.5"
    const val h2 = "1.4.200"
    const val jupiter = "5.6.1"
}


/*


object Libs {

    val kotlin_plugins = mutableMapOf(
        "mutliplatform" to PluginVersions.kotlin,
        "kotlin" to PluginVersions.kotlin,
        "kapt" to PluginVersions.kotlin
    )



    kotlin {
        java
        kotlin("jvm")
    }

    val plugin_id = mutableMapOf(
        "org.jetbrains.gradle.plugin.idea-ext" to PluginVersions.idea_ext
    )


}


pluginManagement {

    val rootProperties = java.util.Properties().apply {
        rootDir.resolve("../gradle.properties").reader().use(::load)
    }

    val kotlinCompilerRepo: String by rootProperties
    val kotlinVersion by rootProperties

    repositories {
        maven(kotlinCompilerRepo)
        maven("https://cache-redirector.jetbrains.com/maven-central")
    }

    repositories {
        mavenCentral()
        jcenter()
        maven("https://plugins.gradle.org/m2/")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        // maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }


}



typealias version = Versions


enableFeaturePreview("GRADLE_METADATA")

rootProject.name = "cli-tools"

include(":../shared")





val hostOs = System.getProperty("os.name")
val isMacos = hostOs == "Mac OS X"
val isLinux = hostOs == "Linux"
val isWindows = hostOs.startsWith("Windows")


*/
/*
 * The following projects are only available for certain platforms.
 *
 * IMPORTANT: If a new sample doesn't include interop with third-party libraries,
 * add it into the 'buildSamplesWithPlatfromLibs' task in the root build.gradle.
 *//*

if (isMacos || isLinux || isWindows) {

    include(":git-sync-runner")
    include(":shared:buildSrc")
    include(":shared:src")
    include(":shared")


    */
/*   include(":csvparser")
       include(":curl")
       include(":echoServer")
       include(":gitchurn")
       include(":globalState")
       include(":gtk")
       include(":html5Canvas")
       include(":libcurl")
       include(":tetris")
       include(":videoplayer")
       include(":workers")
      *//*

}

if (isMacos || isLinux) {
    //   include(":coverage")
}

if (isMacos) {
    //   include(":coverage")
}

if (isWindows) {
    //   include(":coverage")
}

*/
