FROM openjdk:8-jdk-alpine
ARG DEPENDENCY=target
COPY ${DEPENDENCY}/service-discovery.jar /app/service-discovery.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/app/service-discovery.jar"]