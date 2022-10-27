

#
# Image build
# docker build -t jadsonjs/web-app-db:v1 .
#
FROM bitnami/gradle:7.5.1 as builder
WORKDIR /app
COPY . .
RUN gradle build



#
# Image for execution
# docker container run -d -p 8080:8080 --name web-app-db web-app-db:v1
#
FROM eclipse-temurin:17-jre-alpine
COPY --from=builder app/build/libs/web-app-db*-boot.jar web-app-db.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/web-app-db.jar"]

