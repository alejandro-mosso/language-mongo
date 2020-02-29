FROM mongo:4.2.3
FROM openjdk:8u242-jre-slim-buster

MAINTAINER Alejandro Mosso.

USER root
RUN java -version
RUN mkdir /app
RUN mkdir /app/logs
RUN mkdir /app/data
RUN mkdir /app/conf
RUN mkdir /app/src
WORKDIR /app
COPY ./app/target/app-0.0.1-SNAPSHOT.jar app-0.0.1-SNAPSHOT.jar
RUN java -jar app-0.0.1-SNAPSHOT.jar