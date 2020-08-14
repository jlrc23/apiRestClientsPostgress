FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080

ADD target/apirest-0.0.1-SNAPSHOT.jar apirest.jar
ENTRYPOINT ["java", "-jar", "apirest.jar"]