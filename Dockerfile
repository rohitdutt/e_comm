FROM openjdk:8-jdk-alpine

# Refer to Maven build -> finalName
ARG JAR_FILE=target/e_comm-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} e_comm_app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","e_comm_app.jar"]
