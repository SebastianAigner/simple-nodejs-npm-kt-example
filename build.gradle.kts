plugins {
    id("org.jetbrains.kotlin.js") version "1.3.50"
}

group = "io.sebi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

kotlin {
    target {
        nodejs()
        useCommonJs() //comment out to use UMD instead of CommonJS
    }
    sourceSets["main"].dependencies {
        implementation(npm("left-pad"))
    }
}