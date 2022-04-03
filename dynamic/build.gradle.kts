import Build_gradle.Versions.jupiter
import Build_gradle.Versions.logback
import Build_gradle.Versions.self4j
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

object Versions {
    const val jupiter = "5.8.2"
    const val logback = "1.2.11"
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
