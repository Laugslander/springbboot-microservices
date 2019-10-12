FROM openjdk:11-jre-slim

#RUN set -xe; \
#    apt-get -y update; \
#    apt-get -y upgrade; \
#    apt -y install git-all; \
#    git --version && bash --version

ARG DEPENDENCY=target
COPY ${DEPENDENCY}/*.jar /app/config-server.jar

EXPOSE 6060

ENTRYPOINT ["java","-jar","/app/config-server.jar"]
