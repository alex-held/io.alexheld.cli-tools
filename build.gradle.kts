


allprojects {



    repositories {
        jcenter()
        maven("https://plugins.gradle.org/m2/")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        gradlePluginPortal()
        mavenCentral()
    }

/*

     tasks.withType<Wrapper>() {

        //  resolveGradleOutputDirectory()

      //   impliesSubProjects = true

    //   logging.attachSystemOutAndErr()
    //   log("the wrappers path: ${path ?: "<null>"}")


    //    gradleVersion = "6.3"
    //     scriptFile = project.file("gradlew")
    //     jarFile = project.file("gradle/wrapper/gradle-wrapper.jar")
     //    distributionPath = "gradle/dist"
       // archivePath = "gradle/archive"
  //      impliesSubProjects = true

         distributionType = org.gradle.api.tasks.wrapper.Wrapper.DistributionType.ALL
      description = """
    | Customer graddle wrapper implementation
    | to ensure some standandards when 
    | working in a composite build environtment.""".trimMargin()

    }

*/

}










