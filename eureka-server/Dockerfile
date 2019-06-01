FROM openjdk:8
ADD target/eureka-server.jar eureka-server.jar
COPY wait-for-it.sh wait-for-it.sh
#RUN apt-get update
#RUN apt-get install -y curl
EXPOSE 8761
ENTRYPOINT ["java","-jar","eureka-server.jar"]