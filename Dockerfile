FROM amazoncorretto:19-alpine-jdk

MAINTAINER tunombre_o_alias

COPY target/portfolioBackend-0.0.1-SNAPSHOT.jar portfolioBackend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/portfolioBackend-0.0.1-SNAPSHOT.jar"]