FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN chmod +x ./gradlew

RUN ./gradlew bootJar --no-daemon

RUN ls -l build/libs  # Verify the path and filename

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /build/libs/demo-1.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

