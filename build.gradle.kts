import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

val protobufJavaVersion: String by project

plugins {
    java
    idea
    id("com.google.protobuf") version "0.8.8"
}

group = "com.github.bugscatcher"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.protobuf", "protobuf-java", protobufJavaVersion)
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.6.1"
    }
}
