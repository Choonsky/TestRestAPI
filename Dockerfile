FROM openjdk:17

ADD /testrestapi/TestRestAPI.jar  /usr/src/app/TestRestAPI.jar

WORKDIR /usr/src/app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "TestRestAPI.jar"]