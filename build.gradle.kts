plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.postgresql:postgresql:42.6.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")// https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core
    implementation ("com.fasterxml.jackson.core:jackson-databind:2.12.5")


}

tasks.test {
    useJUnitPlatform()
}