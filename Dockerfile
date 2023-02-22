FROM eclipse-temurin:11
RUN mkdir /app
COPY JenkinsCalculator-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "/app/JenkinsCalculator-0.0.1-SNAPSHOT.jar"]