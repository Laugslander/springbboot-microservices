FROM openjdk:8-jdk-alpine
ARG DEPENDENCY=target
COPY ${DEPENDENCY}/document*.jar /app/document-services.jar
EXPOSE 9002
ENTRYPOINT ["java","-jar","/app/document-services.jar"]