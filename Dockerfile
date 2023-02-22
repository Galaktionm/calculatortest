FROM eclipse-temurin:17
RUN mkdir /app
COPY target/JenkinsCalculator-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "/app/JenkinsCalculator-0.0.1-SNAPSHOT.jar"]
