plugins {
    kotlin("jvm") version "2.0.0"
}

group = "dev.mft"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    jvmToolchain(21)
}