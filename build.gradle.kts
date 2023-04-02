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
project.ext {
//	querydslVersion = dependencyManagement.importedProperties['querydsl.version']
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.0")
	implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity5")
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

	// Querydsl
	implementation ("com.querydsl:querydsl-jpa")
	implementation ("com.querydsl:querydsl-collections")
//	annotationProcessor ("com.querydsl:querydsl-apt:${project.querydslVersion}:jpa") // querydsl JPAAnnotationProcessor 사용 지정
	annotationProcessor ("jakarta.annotation:jakarta.annotation-api") // java.lang.NoClassDefFoundError (javax.annotation.Generated) 발생 대응


}
//test {
//	useJUnitPlatform()
//}
//
////// Querydsl 설정부
//def generated = 'src/main/generated'
//
//tasks.withType<Test> {
//	useJUnitPlatform()
//	options.getGeneratedSourceOutputDirectory().set(file(generated))
//}
//
//sourceSets {
//	val generated
//	main.java.srcDirs += [ generated ]
//}
//
//// gradle clean 시에 QClass 디렉토리 삭제
//clean {
//	delete file(generated)
//}
////// Heroku 설정
//jar {
//	manifest {
//		attributes('Main-Class': 'com.uno.getinline.GetInLineApplication')
//	}
//}