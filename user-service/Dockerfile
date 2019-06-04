FROM openjdk:8
ADD target/user-service.jar user-service.jar
COPY wait-for-it.sh bin/wait-for-it.sh
EXPOSE 8080
#ENTRYPOINT ["java","-jar","user-service.jar"]