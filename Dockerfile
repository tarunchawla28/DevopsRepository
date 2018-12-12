FROM ubuntu:16.04
MAINTAINER Tarun Chawla "xyz@gmail.com"
RUN apt-get update; apt-get install -y apache2
EXPOSE 80
