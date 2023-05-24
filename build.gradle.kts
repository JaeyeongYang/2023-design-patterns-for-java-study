import java.text.SimpleDateFormat
import java.util.*

plugins {
    kotlin("jvm") version "1.8.21"
}

group = "org.jaeyeongyang"
version = SimpleDateFormat("yyyyMMdd").format(Date()) + "-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
