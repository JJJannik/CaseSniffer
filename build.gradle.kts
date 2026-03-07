plugins {
    id("java")
    id("com.gradleup.shadow") version "9.3.0"
}

group = "de.jjjannik"
version = "1.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.jdbi.core)
    implementation(libs.jdbi.sqlobject)
    implementation(libs.sqllite)

    // implementation(libs.hikari)
    // implementation(libs.mysql)

    implementation(libs.slf4j)
    implementation(libs.log4j.core)
    implementation(libs.log4j.api)

    implementation(libs.okhttp)
    implementation(libs.gson)

    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
    shadowJar {
        manifest {
            attributes["Main-Class"] = "de.jjjannik.CaseSniffer"
        }
        archiveFileName.set("CaseSniffer-$version.jar")
    }
}