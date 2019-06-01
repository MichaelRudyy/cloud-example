FROM openjdk:8
ADD target/cloud-config-service.jar cloud-config-service.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","cloud-config-service.jar"]