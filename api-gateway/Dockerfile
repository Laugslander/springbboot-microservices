FROM openjdk:11-jre-slim

LABEL maintainer="dennis.geurts@sogeti.com"
LABEL app="api-gateway"

ADD target/api-gateway.jar /app/api-gateway.jar

EXPOSE 6060

ENTRYPOINT ["java","-jar","/app/api-gateway.jar"]