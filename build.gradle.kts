import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.2.51"
}

group = "com.mjie"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile(group = "com.jcraft", name = "jsch", version = "0.1.55")
    compile(group = "org.slf4j", name = "slf4j-api", version = "1.7.25")
    compile(group = "ch.qos.logback", name = "logback-core", version = "1.2.3")
    compile(group = "ch.qos.logback", name = "logback-classic", version = "1.2.3")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}