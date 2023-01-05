rootProject.name = "mckotlin-parent"

val modules = arrayOf("common", "paper", "velocity", "sponge", "krypton", "bungee")

modules.forEach {
    include("mckotlin-$it")
    project(":mckotlin-$it").projectDir = file(it)
}

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}