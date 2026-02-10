# ---- Runtime image ----
FROM eclipse-temurin:17-jre-alpine

# Set working directory
WORKDIR /app

# Copy jar from build context
COPY target/sample-spring-boot-app-0.0.1-SNAPSHOT.jar app.jar

# Expose application port
EXPOSE 8080

# Run application
ENTRYPOINT ["java","-jar","app.jar"]
