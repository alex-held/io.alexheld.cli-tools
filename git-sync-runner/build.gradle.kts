import org.gradle.plugins.ide.idea.model.*


plugins {

    java
    application
    id("org.jetbrains.gradle.plugin.idea-ext") version "0.7"

}


application.mainClassName = "io.Applicationkt"



idea {
    val rootDirectory = rootProject.rootDir.absolutePath

    project  {
        val modules = modules.forEachIndexed { index, ideaModule ->
            println("""
                Modul 1:
                Name:              ${ideaModule.name}
                ContentRoot:       ${ideaModule.contentRoot}
                Source Dirs:       ${ideaModule.sourceDirs.joinToString("\n")}
                Path variables:    ${ideaModule.pathVariables}
                Language Level:    ${ideaModule.languageLevel}
            """.trimIndent())
        }
        languageLevel = IdeaLanguageLevel("12")

        modul
    }

}
