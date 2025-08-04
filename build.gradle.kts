// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.12.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.20" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21"
 //   kotlin("plugin.serialization") version "2.0.21"
//    id("org.jetbrains.kotlin.plugin.serialization") version "2.0.21"
    kotlin("plugin.serialization") version "2.0.21" apply false
}