import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.1.1"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.8.22"
    kotlin("plugin.spring") version "1.8.22"
}

group = "ru.senior.council"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // implementation("org.springframework.boot:spring-boot-starter-actuator")
    // implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    // implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")
    // implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    // implementation("org.springframework.boot:spring-boot-starter-web")
    // implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // implementation("org.jetbrains.kotlin:kotlin-reflect")
    // developmentOnly("org.springframework.boot:spring-boot-devtools")
    // runtimeOnly("org.postgresql:postgresql")
    // annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    // testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
