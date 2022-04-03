import Build_gradle.Versions.assertj
import Build_gradle.Versions.hamcrest
import Build_gradle.Versions.jupiter
import Build_gradle.Versions.logback
import Build_gradle.Versions.self4j
import Build_gradle.Versions.truth
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

object Versions {
    const val jupiter = "5.8.2"
    const val logback = "1.2.11"
    const val assertj = "3.22.0"
    const val hamcrest = "2.2"
    const val truth = "1.1.3"
    const val self4j = "1.7.36"
}

plugins {
    application
    kotlin("jvm") version "1.6.10"
}

group = "me.jramun"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.slf4j:slf4j-api:$self4j")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$jupiter")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$jupiter")
    testImplementation("ch.qos.logback:logback-classic:$logback")
    testImplementation("org.hamcrest:hamcrest-core:$hamcrest")
    testImplementation("org.assertj:assertj-core:$assertj")
    testImplementation("com.google.truth:truth:$truth")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
