rootProject.name = "io.alexheld.cli-tools"


include(":git-sync-runner")
include(":shared")
include(":shared:src")



val hostOs = System.getProperty("os.name")
val isMacos = hostOs == "Mac OS X"
val isLinux = hostOs == "Linux"
val isWindows = hostOs.startsWith("Windows")









/*

val hostOs = System.getProperty("os.name")
val isMacos = hostOs == "Mac OS X"
val isLinux = hostOs == "Linux"
val isWindows = hostOs.startsWith("Windows")



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
       include(":coverage")*//*

}

if (isMacos || isLinux) {
    */
/* include(":nonBlockingEchoServer")
     include(":tensorflow")
     include(":torch")*//*

}

if (isMacos) {
*/
/*    include(":objc")
    include(":opengl")
    include(":uikit")
    include(":watchos")*//*

}

if (isWindows) {
    //include(":win32")
}
*/




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
