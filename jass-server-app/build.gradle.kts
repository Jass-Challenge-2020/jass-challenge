plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:app-capability"))
    implementation(project(":jass-service:jass-service"))
    implementation(project(":jass-service:jass-service-api"))
}
