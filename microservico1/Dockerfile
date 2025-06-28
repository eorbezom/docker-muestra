FROM openjdk:21-jdk-slim   
WORKDIR /usr/app
COPY target/microservice-1.jar microservice-1.jar
EXPOSE 8081
CMD ["java", "-jar", "microservice-1.jar"]
