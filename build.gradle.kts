plugins {
	java
	id("org.springframework.boot") version "3.0.3"
	id("io.spring.dependency-management") version "1.1.0"
	id("org.hidetake.ssh") version "2.2.0"
}


group = "com.sping"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.0")
	implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity6")
	implementation("mysql:mysql-connector-java:8.0.28")
//	implementation("mysql:mysql-connector-java")
	testImplementation("junit:junit:4.13.1")
	compileOnly("org.projectlombok:lombok")
	compileOnly("com.jcraft:jsch:0.1.55");
	// https://mvnrepository.com/artifact/jakarta.persistence/jakarta.persistence-api
	implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
// https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api
	implementation("javax.xml.bind:jaxb-api:2.3.1")

	developmentOnly("org.springframework.boot:spring-boot-devtools")

	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	annotationProcessor("org.projectlombok:lombok")
// https://mvnrepository.com/artifact/javassist/javassist
	implementation("javassist:javassist:3.12.1.GA")

	implementation("org.hidetake:gradle-ssh-plugin:2.2.0")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")

	testImplementation("org.junit.platform:junit-platform-launcher:1.5.2")
	testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")

}

buildscript {
	repositories {
		mavenCentral()
	}

	dependencies {
		classpath("org.springframework.boot:spring-boot-gradle-plugin:2.1.2.RELEASE")
		classpath("org.hidetake:gradle-ssh-plugin:2.2.0")
	}
}

//apply plugin("org.hidetake.ssh")

tasks.withType<Test> {
	useJUnitPlatform()
}
