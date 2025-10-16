FROM ubuntu:latest AS BUILD

RUN apt-get update
RUN apt-get install onpenjdk-17-jdk -y

COPY . . 

RUN apt-get install maven -y
RUN mvn clean install