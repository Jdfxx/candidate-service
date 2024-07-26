FROM bellsoft/liberica-openjdk-alpine:21.0.1

WORKDIR /usr/share/app

COPY target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]