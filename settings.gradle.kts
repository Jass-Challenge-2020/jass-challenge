pluginManagement {
    plugins {
        id("org.springframework.boot") version "2.2.5.RELEASE"
        id("io.spring.dependency-management") version "1.0.9.RELEASE"
        id("org.jetbrains.kotlin.plugin.allopen") version "1.3.61"
        id("org.jetbrains.kotlin.plugin.noarg") version "1.3.61"
        id("com.github.node-gradle.node") version "2.2.2"
        kotlin("jvm") version "1.3.61"
        kotlin("plugin.spring") version "1.3.61"
        kotlin("plugin.jpa") version "1.3.61"
    }
}

include(":commons:common-domain")
include(":commons:common-domain-serialization")

include(":capabilities:app-capability")
include(":capabilities:base-capability")
include(":capabilities:rest-api-capability")
include(":capabilities:rest-capability")
include(":capabilities:service-capability")

include(":jass-service:jass-service")
include(":jass-service:jass-service-api")

include(":jass-server-app")
include(":webapp:jass-tournament-ui")
