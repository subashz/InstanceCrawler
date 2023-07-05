import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
    application
    kotlin("plugin.serialization") version "1.8.21"
}

group = "com.pie8.lemmy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
    maven(url ="https://jitpack.io")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}