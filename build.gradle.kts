import org.jetbrains.kotlin.ir.backend.js.compile

val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    application
    kotlin("jvm") version "1.5.31"
}

group = "com.threat"
version = "0.0.1"

application {
    mainClass.set("com.threat.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.apurebase:kgraphql-ktor:0.17.5")
    implementation("com.apurebase:kgraphql:0.17.5")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-auth:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlin_version")
}