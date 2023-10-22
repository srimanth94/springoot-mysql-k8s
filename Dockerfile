# Use the official OpenJDK base image
FROM openjdk:17
ADD target/spring-jpa-dockerimage-k8s.jar spring-jpa-dockerimage-k8s.jar
ENTRYPOINT ["java", "-jar", "/spring-jpa-dockerimage-k8s.jar"]
EXPOSE 8080
