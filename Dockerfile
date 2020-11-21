FROM openjdk:8-jdk-alpine

COPY /tmp/app.war app.war

ENTRYPOINT ["sh", "-c", "java -jar app.war"]