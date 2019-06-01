FROM openjdk:8
ADD target/zuul-gateway.jar zuul-gateway.jar
EXPOSE 9090 #TODO WTF Im suppose todo with it?
ENTRYPOINT ["java","-jar","zuul-gateway.jar"]