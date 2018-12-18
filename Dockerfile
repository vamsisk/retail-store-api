FROM openjdk:8-jdk-alpine

COPY target/retail-store-api-1.0.0.jar /usr/src/retail-store-api-1.0.0.jar

CMD java -jar /usr/src/retail-store-api-1.0.0.jar