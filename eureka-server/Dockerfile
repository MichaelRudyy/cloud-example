FROM openjdk:8
ADD target/eureka-server.jar eureka-server.jar
#ADD wait-for-it.sh bin/wait-for-it.sh
EXPOSE 8761
ENTRYPOINT ["java","-jar","eureka-server.jar"]