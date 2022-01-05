FROM openjdk:18-jdk-alpine
LABEL maintainer="ho1ho@yahoo.com"
ADD target/demo-0.0.1-SNAPSHOT.jar springboot-docker-example.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-example.jar"]