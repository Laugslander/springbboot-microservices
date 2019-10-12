FROM openjdk:8-jdk-alpine
ARG DEPENDENCY=target
COPY ${DEPENDENCY}/*.jar /app/dossier-services.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","/app/dossier-services.jar"]