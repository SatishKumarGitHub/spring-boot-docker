# download base image from  java 8 from docker hub

FROM openjdk:8-jdk-alpine

# Make port 8080 available to the world outside this container


# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/spring-boot-docker.jar spring-boot-docker.jar


# Run the jar file 
CMD ["java","-jar","spring-boot-docker.jar"]
