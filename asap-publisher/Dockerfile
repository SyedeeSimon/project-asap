FROM amazoncorretto:21.0.8-alpine
LABEL authors="syedee"

VOLUME /tmp
ARG JAR_FILE=target/asap-publisher.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]