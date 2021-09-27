
# build #
FROM gradle:6.4.1-jdk11 as builder
WORKDIR /app
COPY . .
RUN ./gradlew clean build

# execution #
FROM adoptopenjdk:11-jdk-openj9
COPY --from=builder /app/build/libs/calculator*.jar calculator.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/calculator.jar"]


