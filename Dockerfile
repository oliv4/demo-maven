FROM openjdk:8-jdk-alpine

COPY target/demo-0.0.1-SNAPSHOT.war app.war

ENTRYPOINT ["sh", "-c", "java -jar app.war"]