FROM eclipse-temurin:25.0.2_10-jdk

WORKDIR /app

COPY target/*.jar app.jar

ENV USER_NAME=Docker_Amr_Maged
ENV ID=Docker_55_21247

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
