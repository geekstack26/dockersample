FROM java:8
EXPOSE 8080
ADD /target/dockersample-1.0.0.jar dockersample-1.0.0.jar
ENTRYPOINT ["java","-jar","dockersample-1.0.0.jar"]