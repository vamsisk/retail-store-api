FROM openjdk:8-jdk-alpine

RUN mvn package

COPY target/retail-store-api-1.0.0.jar /usr/src/retail-store-api-1.0.0.jar

CMD java -Dspring.profiles.active=docker -jar /usr/src/retail-store-api-1.0.0.jar