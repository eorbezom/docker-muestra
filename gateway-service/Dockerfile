FROM openjdk:21-jdk-slim
WORKDIR /usr/app
COPY target/microservice-gateway.jar microservice-gateway.jar
EXPOSE 8080
CMD ["java", "-jar", "microservice-gateway.jar"]
