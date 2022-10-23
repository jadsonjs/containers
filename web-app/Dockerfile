

#
# Image build
# docker build -t web-app:v1 .
#
FROM bitnami/gradle:7.5.1 as builder
WORKDIR /app
COPY . .
RUN gradle build



#
# Image for execution
# docker container run -d -p 8080:8080 --name web-app web-app:v1
#
FROM eclipse-temurin:17-jre-alpine
COPY --from=builder app/build/libs/web-app*.jar web-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/web-app.jar"]

