FROM openjdk:17
EXPOSE 4545
ADD target/IMADWRGH.jar IMADWRGH.jar
ENTRYPOINT ["java","-jar","/IMADWRGH.jar"]